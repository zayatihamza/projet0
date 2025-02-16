package com.example.projet0.services;

import com.example.projet0.entities.ChefCuisinier;

import java.util.List;

public interface IChefService {
    public ChefCuisinier addChef(ChefCuisinier e);
    public ChefCuisinier updateChef(ChefCuisinier e);
    public ChefCuisinier retrieveChef(Long idChef);
    public void removeChef(Long idChef);
    public List<ChefCuisinier> retrieveAllChefs();
    public List<ChefCuisinier> addChefs(List<ChefCuisinier> chefs);
}
