package com.example.projet0.services;

import com.example.projet0.entities.ChefCuisinier;
import com.example.projet0.repositories.ChefRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ChefServiceImpl implements IChefService{

    ChefRepository chefRepository;
    @Override
    public ChefCuisinier addChef(ChefCuisinier e) {
        return chefRepository.save(e);
    }

    @Override
    public ChefCuisinier updateChef(ChefCuisinier e) {
        return chefRepository.save(e);
    }

    @Override
    public ChefCuisinier retrieveChef(Long idChef) {
        Optional<ChefCuisinier> chef= chefRepository.findById(idChef);
        return chef.orElseThrow(() -> new RuntimeException("Chef not found for id: " + idChef));
    }

    @Override
    public void removeChef(Long idChef) {
        chefRepository.deleteById(idChef);
    }

    @Override
    public List<ChefCuisinier> retrieveAllChefs() {
        return (List<ChefCuisinier>) chefRepository.findAll();
    }

    @Override
    public List<ChefCuisinier> addChefs(List<ChefCuisinier> chefs) {
        return (List<ChefCuisinier>) chefRepository.saveAll(chefs);
    }
}
