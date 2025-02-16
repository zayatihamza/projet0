package com.example.projet0.services;

import com.example.projet0.entities.ChaineRestauration;

import java.util.List;

public interface IChaineRestaurationService {
    List<ChaineRestauration> retrieveAllChaines();
    ChaineRestauration addChaine(ChaineRestauration e);
    ChaineRestauration updateChaine(ChaineRestauration e);
    ChaineRestauration retrieveChaine(Long idChaine);
    void removeChaine(Long idChaine);
    List<ChaineRestauration> addChaines(List<ChaineRestauration> chaines);

}
