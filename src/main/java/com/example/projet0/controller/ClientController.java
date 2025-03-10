package com.example.projet0.controller;

import com.example.projet0.entities.Client;
import com.example.projet0.services.IClientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/client")
public class ClientController {
    IClientService clientService;

    @GetMapping("/get-all-clients")
    public List<Client> getClients(){
        return clientService.retrieveAllClients();
    }

    @PostMapping("/add-client")
    public Client addClient(@RequestBody Client c) {
        return clientService.addClient(c);

    }

    @PostMapping("/add-list-clients")
    public Iterable<Client> addClientList(@RequestBody List<Client> clients){
        return clientService.addListClients(clients);
    }

    @DeleteMapping("/remove-client/{client-id}")
    public void removeClient(@PathVariable("client-id") Long clientId) {
        clientService.removeClient(clientId);
    }

    @PutMapping("/update-client")
    public Client updateClient(@RequestBody Client c) {
        return clientService.updateClient(c);
    }


    @GetMapping("/retrieve-client/{client-id}")
    public Client retrieveClient(@PathVariable("client-id") Long clientId) {
        return clientService.retrieveClient(clientId);
    }


}
