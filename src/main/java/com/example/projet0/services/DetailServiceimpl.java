package com.example.projet0.services;

import com.example.projet0.entities.DetailComposant;
import com.example.projet0.repositories.DetailComposantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class DetailServiceimpl implements IDetailComposant{
    DetailComposantRepository detailComposantRepository;

    @Override
    public List<DetailComposant> retrieveAllDetailcomposants() {
        return (List<DetailComposant>) detailComposantRepository.findAll();
    }

    @Override
    public DetailComposant addDetailcomposant(DetailComposant e) {
        return detailComposantRepository.save(e);
    }

    @Override
    public DetailComposant updateDetailcomposant(DetailComposant e) {
        return detailComposantRepository.save(e);
    }

    @Override
    public DetailComposant retrieveDetailcomposant(Long idDetailcomposant) {
        Optional<DetailComposant> detail = detailComposantRepository.findById(idDetailcomposant);
        return detail.orElseThrow(() -> new RuntimeException("Detail not found for id: " + idDetailcomposant));
    }

    @Override
    public void removeDetailcomposant(Long idDetailcomposant) {
        detailComposantRepository.deleteById(idDetailcomposant);
    }

    @Override
    public List<DetailComposant> addDetailcomposants(List<DetailComposant> detailcomposants) {
        return (List<DetailComposant>) detailComposantRepository.saveAll(detailcomposants);
    }
}
