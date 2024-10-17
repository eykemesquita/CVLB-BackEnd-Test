package com.github.eykemesquita.customer_api.domain.service;

import com.github.eykemesquita.customer_api.domain.model.Client;
import com.github.eykemesquita.customer_api.domain.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public List<Client> getClients() throws SQLException {
        List<Client> clients = clientRepository.getClients();
        return clients;
    }

    public Client createClients(Client client) {
        Client clientSaved = null;
        clientSaved = client;
        return clientSaved;
    }
}
