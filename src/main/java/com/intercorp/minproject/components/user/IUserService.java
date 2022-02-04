package com.intercorp.minproject.components.user;


import com.intercorp.minproject.components.user.response.KpiClients;
import com.intercorp.minproject.components.user.response.ListClient;

import java.util.List;

public interface IUserService {

    User create(User user);
    KpiClients calc();
    List<ListClient> listClients();
}
