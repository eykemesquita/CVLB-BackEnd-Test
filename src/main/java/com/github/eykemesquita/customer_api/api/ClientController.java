package com.github.eykemesquita.customer_api.api;

import com.github.eykemesquita.customer_api.domain.model.Client;
import com.github.eykemesquita.customer_api.domain.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping
    public ResponseEntity<List<Client>> getClients() {
        List<Client> clientResponse = clientService.getClients();
        return new ResponseEntity<>(clientResponse, clientResponse.isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.OK);

    }

}
