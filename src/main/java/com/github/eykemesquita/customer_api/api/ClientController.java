package com.github.eykemesquita.customer_api.api;

import com.github.eykemesquita.customer_api.domain.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @GetMapping
    public List<Client> getClients() {
        Client client = null;
        List<Client> clients = new ArrayList<>();
        clients.add(client);
        return clients;
    }

}
