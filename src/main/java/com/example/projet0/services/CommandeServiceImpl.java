package com.example.projet0.services;

import com.example.projet0.entities.Commande;
import com.example.projet0.entities.Menu;
import com.example.projet0.repositories.CommandeRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
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

    @Override
    public void findCurrentYearCommandesOrderByNote() {
        List<Commande> c=commandeRepository.findCurrentYearCommandesOrderByNote();
        for (Commande commande : c) {
            log.info("La commande faite le "+commande.getDateCommande()+" d'un montant global de  "+commande.getTotalCommande()+" a une note de "+commande.getNote());
        }

    }
    public static int countOccurrences(List<Menu> list, Menu target) {
        int count = 0;
        for (Menu element : list) {
            if (element.equals(target)) {
                count++;
            }
        }
        return count;
    }

    @Scheduled(fixedRate = 10000)
    @Override
    public void menuPlusCommande() {
        List<Commande> commandes = (List<Commande>)commandeRepository.findAll();
        List<Menu> menus=new ArrayList<>();
        for (Commande commande : commandes) {
            menus.add(commande.getMenu());
        }
        int max=0;
        Menu menumax=new Menu();
        for (Menu menu : menus) {
            int count = countOccurrences(menus, menu);
            if (count > max) {
                max = count;
                menumax=menu;
            }
        }

        log.info("Le menu le plus commandé est "+menumax.getLibelleMenu()+" avec "+max+" commandes");

    }
}
