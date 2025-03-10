package com.example.projet0.controller;


import com.example.projet0.entities.Commande;
import com.example.projet0.repositories.CommandeRepository;
import com.example.projet0.services.ICommandeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/commande")
public class CommandeController {

    ICommandeService commandeService;

    @Autowired
    CommandeRepository commandeRepository;

    @GetMapping("/get-all-commandes")
    public List<Commande> getCommandes(){
        return commandeService.retrieveAllCommandes();
    }

    @PostMapping("/add-commande")
    public Commande addCommande(@RequestBody Commande c) {
        return commandeService.addCommande(c);
    }

    @DeleteMapping("/remove-commande/{commande-id}")
    public void removeCommande(@PathVariable("commande-id") Long commandeId) {commandeService.removeCommande(commandeId);}

    @PutMapping("/update-commande")
    public Commande updateCommande(@RequestBody Commande c) {
        return commandeService.updateCommande(c);
    }

    @GetMapping("/retrieve-commande/{commande-id}")
    public Commande retrieveCommande(@PathVariable("commande-id") Long commandeId) {return commandeService.retrieveCommande(commandeId);}

    @GetMapping("/get-commandes-by-client/{client-id}")
    public List<Commande> getCommandesByClient(@PathVariable("client-id") Long clientId) {
        return commandeRepository.findByClientIdClient(clientId);
    }

    @GetMapping("/get-commandes-by-client-and-date/{client-id}/{date1}/{date2}")
    public List<Commande> getCommandesByClientAndDate(@PathVariable("client-id") Long clientId, @PathVariable("date1") LocalDate date1, @PathVariable("date2") LocalDate date2) {
        return commandeRepository.findByClientIdClientAndDateCommandeBetween(clientId, date1, date2);
    }

    @GetMapping("/get-commandes-by-date/{date1}/{date2}")
    public List<Commande> getCommandesByDate(@PathVariable("date1") LocalDate date1, @PathVariable("date2") LocalDate date2) {
        return commandeRepository.findByDateCommandeBetweenOrderByTotalCommandeAscNoteAsc(date1, date2);
    }

}
