package com.intercorp.minproject.components.user.useCase;

import com.intercorp.minproject.components.user.User;

import java.util.List;

public class StandardDeviation {

    public Double calcDeviation(List<User> users, Double media){
        double variance = 0.0;

        for (User user : users) {
            double range = Math.pow(user.getAge() - media, 2f);
            variance = variance + range;
        }

        variance = variance / users.size();
        return Math.sqrt(variance);
    }
}
