package com.intercorp.minproject.components.user.useCase;

import com.intercorp.minproject.components.user.User;

import java.util.List;
import java.util.stream.Collectors;

public class Media {


    public Double calcMedia(List<User> users) {
        List<Integer> ages = users.stream()
                .map(User::getAge)
                .collect(Collectors.toList());
        Integer sumAges = ages.stream().reduce(0, Integer::sum);
        return sumAges * 1.0 / ages.size();
    }

}
