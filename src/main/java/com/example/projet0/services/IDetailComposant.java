package com.example.projet0.services;

import com.example.projet0.entities.DetailComposant;

import java.util.List;

public interface IDetailComposant {
    List<DetailComposant> retrieveAllDetailcomposants();
    DetailComposant addDetailcomposant(DetailComposant e);
    DetailComposant updateDetailcomposant(DetailComposant e);
    DetailComposant retrieveDetailcomposant(Long idDetailcomposant);
    void removeDetailcomposant(Long idDetailcomposant);
    List<DetailComposant> addDetailcomposants(List<DetailComposant> detailcomposants);

}
