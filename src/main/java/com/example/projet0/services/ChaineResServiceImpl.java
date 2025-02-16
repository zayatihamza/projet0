package com.example.projet0.services;

import com.example.projet0.entities.ChaineRestauration;
import com.example.projet0.repositories.ChaineRestaurationRepository;

import java.util.List;
import java.util.Optional;

public class ChaineResServiceImpl implements IChaineRestaurationService {
    ChaineRestaurationRepository chaineRestaurationRepository;
    @Override
    public List<ChaineRestauration> retrieveAllChaines() {

        return (List<ChaineRestauration>) chaineRestaurationRepository.findAll();
    }

    @Override
    public ChaineRestauration addChaine(ChaineRestauration e) {
        return chaineRestaurationRepository.save(e);
    }

    @Override
    public ChaineRestauration updateChaine(ChaineRestauration e) {
        return chaineRestaurationRepository.save(e);
    }

    @Override
    public ChaineRestauration retrieveChaine(Long idChaine) {
        Optional<ChaineRestauration> chaine = chaineRestaurationRepository.findById(idChaine);
        return chaine.orElseThrow(() -> new RuntimeException("Chaine not found for id: " + idChaine));
    }


    @Override
    public void removeChaine(Long idChaine) {
        chaineRestaurationRepository.deleteById(idChaine);

    }

    @Override
    public List<ChaineRestauration> addChaines(List<ChaineRestauration> chaines) {
        return (List<ChaineRestauration>) chaineRestaurationRepository.saveAll(chaines);
    }
}
