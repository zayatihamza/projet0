package com.example.projet0.repositories;

import com.example.projet0.entities.ChefCuisinier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChefRepository extends CrudRepository<ChefCuisinier,Long> {

}
