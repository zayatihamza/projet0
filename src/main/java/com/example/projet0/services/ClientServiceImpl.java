package com.example.projet0.services;

import com.example.projet0.entities.Client;
import com.example.projet0.repositories.ClientRepository;

import java.util.List;
import java.util.Optional;

public class ClientServiceImpl implements IClientService{

    ClientRepository clientRepository;
    @Override
    public List<Client> retrieveAllClients() {
        return (List<Client>) clientRepository.findAll();
    }

    @Override
    public Client addClient(Client e) {
        return clientRepository.save(e);
    }

    @Override
    public Client updateClient(Client e) {
        return clientRepository.save(e);
    }

    @Override
    public Client retrieveClient(Long idClient) {
        Optional<Client> client = clientRepository.findById(idClient);
        return client.orElseThrow(() -> new RuntimeException("Client not found for id: " + idClient));
    }

    @Override
    public void removeClient(Long idClient) {
        clientRepository.deleteById(idClient);
    }

    @Override
    public List<Client> addClients(List<Client> clients) {
        return (List<Client>) clientRepository.saveAll(clients);
    }
}
