package com.example.projet0.repositories;

import com.example.projet0.entities.Composant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComposantRepository extends CrudRepository<Composant,Long> {
}
