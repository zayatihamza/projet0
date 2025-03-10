package com.example.projet0.repositories;

import com.example.projet0.entities.ChaineRestauration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChaineRestaurationRepository extends CrudRepository<ChaineRestauration, Long> {

}
