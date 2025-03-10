package com.example.projet0.services;

import com.example.projet0.entities.Restaurant;
import com.example.projet0.repositories.RestaurantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class RestaurantServiceImpl implements IRestaurantService{
    RestaurantRepository restaurantRepository;
    @Override
    public Restaurant addRestaurant(Restaurant e) {
        return restaurantRepository.save(e);
    }

    @Override
    public Restaurant updateRestaurant(Restaurant e) {
        return restaurantRepository.save(e);
    }

    @Override
    public Restaurant retrieveRestaurant(Long idRestaurant) {
        Optional<Restaurant> restaurant = restaurantRepository.findById(idRestaurant);
        return restaurant.orElseThrow(() -> new RuntimeException("Restaurant not found for id: " + idRestaurant));
    }

    @Override
    public void removeRestaurant(Long idRestaurant) {
        restaurantRepository.deleteById(idRestaurant);
    }

    @Override
    public List<Restaurant> retrieveAllRestaurants() {
        return (List<Restaurant>) restaurantRepository.findAll();
    }

    @Override
    public List<Restaurant> addRestaurants(List<Restaurant> restaurants) {
        return (List<Restaurant>) restaurantRepository.saveAll(restaurants);
    }
}
