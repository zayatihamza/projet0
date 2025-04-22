package com.example.projet0.services;

import com.example.projet0.entities.Composant;
import com.example.projet0.entities.Menu;
import com.example.projet0.entities.Restaurant;
import com.example.projet0.entities.TypeMenu;

import java.util.List;
import java.util.Set;

public interface IMenuService {
    public Menu addMenu(Menu e);
    public Menu updateMenu(Menu e);
    public Menu retrieveMenu(Long idMenu);
    public void removeMenu(Long idMenu);
    public List<Menu> retrieveAllMenus();
    public List<Menu> addMenus(List<Menu> menus);
    public Restaurant ajoutRestaurantEtMenuAssocies(Restaurant restaurant);
    public Menu ajoutComposantEtMiseAJourPrixTotal(Long idMenu, Set<Composant> composants);
    public List<String> nomMenuParTypeMenuOrdonneParPrixTotal(TypeMenu typeMenu);
}

