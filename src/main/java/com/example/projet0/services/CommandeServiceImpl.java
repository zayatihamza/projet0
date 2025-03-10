package com.example.projet0.services;

import com.example.projet0.entities.Commande;
import com.example.projet0.repositories.CommandeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CommandeServiceImpl implements ICommandeService {
    private CommandeRepository commandeRepository;


    @Override
    public Commande addCommande(Commande e) {
        return commandeRepository.save(e);
    }

    @Override
    public Commande updateCommande(Commande e) {
        return commandeRepository.save(e);
    }

    @Override
    public Commande retrieveCommande(Long idCommande) {
        return commandeRepository.findById(idCommande).orElse(null);
    }

    @Override
    public void removeCommande(Long idCommande) {
        commandeRepository.deleteById(idCommande);
    }

    @Override
    public List<Commande> retrieveAllCommandes() {
        return (List<Commande>) commandeRepository.findAll();
    }

    @Override
    public List<Commande> addCommandes(List<Commande> commandes) {
        return (List<Commande>) commandeRepository.saveAll(commandes);
    }
}
