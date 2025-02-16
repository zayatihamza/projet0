package com.example.projet0.services;

import com.example.projet0.entities.Detailcomposant;
import com.example.projet0.repositories.DetailComposantRepository;

import java.util.List;
import java.util.Optional;

public class DetailServiceimpl implements IDetailComposant{
    DetailComposantRepository detailComposantRepository;

    @Override
    public List<Detailcomposant> retrieveAllDetailcomposants() {
        return (List<Detailcomposant>) detailComposantRepository.findAll();
    }

    @Override
    public Detailcomposant addDetailcomposant(Detailcomposant e) {
        return detailComposantRepository.save(e);
    }

    @Override
    public Detailcomposant updateDetailcomposant(Detailcomposant e) {
        return detailComposantRepository.save(e);
    }

    @Override
    public Detailcomposant retrieveDetailcomposant(Long idDetailcomposant) {
        Optional<Detailcomposant> detail = detailComposantRepository.findById(idDetailcomposant);
        return detail.orElseThrow(() -> new RuntimeException("Detail not found for id: " + idDetailcomposant));
    }

    @Override
    public void removeDetailcomposant(Long idDetailcomposant) {
        detailComposantRepository.deleteById(idDetailcomposant);
    }

    @Override
    public List<Detailcomposant> addDetailcomposants(List<Detailcomposant> detailcomposants) {
        return (List<Detailcomposant>) detailComposantRepository.saveAll(detailcomposants);
    }
}
