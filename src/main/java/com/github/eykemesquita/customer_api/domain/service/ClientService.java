package com.github.eykemesquita.customer_api.domain.service;

import com.github.eykemesquita.customer_api.domain.model.Client;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {

    public List<Client> getClients() {
        Client client = null;
        List<Client> clients = new ArrayList<>();
        clients.add(client);
        return clients;
    }

}
