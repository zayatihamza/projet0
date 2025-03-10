package com.example.projet0.controller;

import com.example.projet0.entities.Restaurant;
import com.example.projet0.repositories.RestaurantRepository;
import com.example.projet0.services.IRestaurantService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Restaurant")
public class RestaurantController {
    IRestaurantService restaurantService;

    @Autowired
    RestaurantRepository restaurantRepository;

    @GetMapping("/get-all-restaurants")
    public List<Restaurant> getRestaurants(){
        return restaurantService.retrieveAllRestaurants();
    }

    @GetMapping("get-restaurant/{restaurant-id}")
    public Restaurant getRestaurant(@PathVariable("restaurant-id") Long restaurantId) {
        return restaurantService.retrieveRestaurant(restaurantId);
    }

    @DeleteMapping("/remove-restaurant/{restaurant-id}")
    public void removeRestaurant(@PathVariable("restaurant-id") Long restaurantId) {
        restaurantService.removeRestaurant(restaurantId);
    }

    @PutMapping("/update-restaurant")
    public Restaurant updateRestaurant(@RequestBody Restaurant c) {
        return restaurantService.updateRestaurant(c);
    }

    @PostMapping("/add-restaurant")
    public Restaurant addRestaurant(@RequestBody Restaurant c) {
        return restaurantService.addRestaurant(c);
    }


    @GetMapping("/get-restaurant-by-chaine-restauration-libelle/{libelle}")
    public List<Restaurant> getRestaurantByChaineRestaurationLibelle(@PathVariable("libelle") String libelle) {
        return restaurantRepository.findByChaineRestaurationLibelle(libelle);
    }

    @GetMapping("/get-restaurant-by-nb-places-max-greater-than-and-chaine-restauration-date-creation-before/{capacite}/{date}")
    public List<Restaurant> getRestaurantByNbPlacesMaxGreaterThanAndChaineRestaurationDateCreationBefore(@PathVariable("capacite") Integer capacite, @PathVariable("date") String date) {
        return restaurantRepository.findByNbPlacesMaxGreaterThanAndChaineRestaurationDateCreationBefore(capacite, LocalDate.parse(date));
    }

}
