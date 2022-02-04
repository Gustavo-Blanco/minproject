package com.intercorp.minproject.components.user;
import com.intercorp.minproject.components.user.request.CreateClient;
import com.intercorp.minproject.components.user.response.KpiClients;
import com.intercorp.minproject.components.user.response.ListClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private IUserService iUserService;

    @PostMapping(
            path = "/creacliente",
            consumes = {MediaType.APPLICATION_JSON_VALUE}
    )
    public User createClient(@RequestBody CreateClient createClient){
        try {
            return iUserService.create(createClient.setToUserFields());
        } catch (Exception e) {
            return null;
        }
    }

    @GetMapping(path = "/kpideclientes")
    public KpiClients kpiClients(){
        return iUserService.calc();
    }

    @GetMapping(path = "/listclientes")
    public List<ListClient> allWithDead(){
        return iUserService.listClients();
    }
}
