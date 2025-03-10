package com.example.projet0.services;

import com.example.projet0.entities.Composant;
import com.example.projet0.repositories.ComposantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ComposantServiceImpl implements IComposantService {

    ComposantRepository composantRepository;
    @Override
    public List<Composant> retrieveAllComposants() {
        return (List<Composant>) composantRepository.findAll();
    }

    @Override
    public Composant addComposant(Composant e) {
        return composantRepository.save(e);
    }

    @Override
    public Composant updateComposant(Composant e) {
        return composantRepository.save(e);
    }

    @Override
    public Composant retrieveComposant(Long idComposant) {
        Optional<Composant> composant = composantRepository.findById(idComposant);
        return composant.orElseThrow(() -> new RuntimeException("Composant not found for id: " + idComposant));
    }

    @Override
    public void removeComposant(Long idComposant) {
        composantRepository.deleteById(idComposant);
    }

    @Override
    public List<Composant> addComposants(List<Composant> composants) {
        return (List<Composant>) composantRepository.saveAll(composants);
    }
}
