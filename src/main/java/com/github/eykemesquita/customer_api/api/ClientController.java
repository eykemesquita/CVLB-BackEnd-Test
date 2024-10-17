package com.github.eykemesquita.customer_api.api;

import com.github.eykemesquita.customer_api.domain.model.Client;
import com.github.eykemesquita.customer_api.domain.service.ClientService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping
    public ResponseEntity<List<Client>> getClients() throws SQLException {
        List<Client> clientResponse = clientService.getClients();
        return new ResponseEntity<>(clientResponse, clientResponse.isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.OK);

    }

    @PostMapping
    public ResponseEntity<Client> createClient(@Valid @RequestBody Client client) {
        Client savedClient = clientService.createClients(client);
        return new ResponseEntity<>(savedClient, HttpStatus.CREATED);
    }



}
