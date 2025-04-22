package com.example.projet0.services;

import com.example.projet0.entities.Commande;

import java.util.List;

public interface ICommandeService {
    Commande addCommande(Commande e);
    Commande updateCommande(Commande e);
    Commande retrieveCommande(Long idCommande);
    void removeCommande(Long idCommande);
    List<Commande> retrieveAllCommandes();
    List<Commande> addCommandes(List<Commande> commandes);
    void findCurrentYearCommandesOrderByNote();
    void menuPlusCommande();

}
