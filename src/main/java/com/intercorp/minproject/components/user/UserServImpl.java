package com.intercorp.minproject.components.user;

import com.intercorp.minproject.components.user.response.KpiClients;
import com.intercorp.minproject.components.user.response.ListClient;
import com.intercorp.minproject.components.user.useCase.DeadDay;
import com.intercorp.minproject.components.user.useCase.Media;
import com.intercorp.minproject.components.user.useCase.StandardDeviation;
import com.intercorp.minproject.util.DateFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServImpl implements IUserService {

    @Autowired
    private IUserRepository iUserRepository;

    @Override
    public User create(User user) {
        return iUserRepository.save(user);
    }

    @Override
    public KpiClients calc() {
        List<User> users = iUserRepository.findAll();

        Double ageAverage = new Media().calcMedia(users);
        Double standardDeviation = new StandardDeviation().calcDeviation(users, ageAverage);

        KpiClients kpiClients = new KpiClients(ageAverage, standardDeviation);

        return kpiClients;
    }

    @Override
    public List<ListClient> listClients() {
        List<User> users = iUserRepository.findAll();

        return users.stream().map(user -> {
            return new ListClient(
                    user.getName(),
                    user.getLastname(),
                    user.getAge(),
                    DateFormat.formatDate("dd/mm/yyyy", user.getBirthDay()),
                    new DeadDay().calcDeadDate(user.getBirthDay())
                    );
        }).collect(Collectors.toList());
    }

}
