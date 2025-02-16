package com.example.projet0.services;

import com.example.projet0.entities.Detailcomposant;

import java.util.List;

public interface IDetailComposant {
    List<Detailcomposant> retrieveAllDetailcomposants();
    Detailcomposant addDetailcomposant(Detailcomposant e);
    Detailcomposant updateDetailcomposant(Detailcomposant e);
    Detailcomposant retrieveDetailcomposant(Long idDetailcomposant);
    void removeDetailcomposant(Long idDetailcomposant);
    List<Detailcomposant> addDetailcomposants(List<Detailcomposant> detailcomposants);

}
