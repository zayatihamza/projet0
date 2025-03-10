package com.example.projet0.repositories;

import com.example.projet0.entities.DetailComposant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailComposantRepository extends CrudRepository<DetailComposant,Long> {
}
