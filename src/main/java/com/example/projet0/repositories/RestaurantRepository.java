package com.example.projet0.repositories;

import com.example.projet0.entities.Restaurant;
import org.springframework.data.repository.CrudRepository;

public interface RestaurantRepository extends CrudRepository<Restaurant,Long> {
}
