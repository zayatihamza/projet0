package com.example.projet0.repositories;

import com.example.projet0.entities.Commande;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;


@Repository
public interface CommandeRepository extends CrudRepository<Commande,Long> {
    List<Commande> findByClientIdClient(Long id);
    List<Commande> findByClientIdClientAndDateCommandeBetween(Long id, LocalDate date1, LocalDate date2);

    List<Commande> findByDateCommandeBetweenOrderByTotalCommandeAscNoteAsc(LocalDate date1, LocalDate date2);

    @Query("select c from Commande c where year(c.dateCommande) = year(current_date) order by c.note asc")
    List<Commande> findCurrentYearCommandesOrderByNote();
}
