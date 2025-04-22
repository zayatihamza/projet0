package com.example.projet0.services;

import com.example.projet0.entities.Restaurant;

import java.util.List;

public interface IRestaurantService {
    public Restaurant addRestaurant(Restaurant e);
    public Restaurant updateRestaurant(Restaurant e);
    public Restaurant retrieveRestaurant(Long idRestaurant);
    public void removeRestaurant(Long idRestaurant);
    public List<Restaurant> retrieveAllRestaurants();
    public List<Restaurant> addRestaurants(List<Restaurant> restaurants);
    public Restaurant affecterRestaurantAChaineRestauration(String nomRestaurant, String libelleChaine );

}
