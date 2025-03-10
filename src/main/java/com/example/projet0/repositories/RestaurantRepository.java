package com.example.projet0.repositories;

import com.example.projet0.entities.Restaurant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface RestaurantRepository extends CrudRepository<Restaurant,Long> {
    List<Restaurant> findByChaineRestaurationLibelle(String l);

    List<Restaurant> findByNbPlacesMaxGreaterThanAndChaineRestaurationDateCreationBefore(Integer capacite, LocalDate date);

}
