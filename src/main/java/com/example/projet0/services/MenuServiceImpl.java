package com.example.projet0.services;

import com.example.projet0.entities.Composant;
import com.example.projet0.entities.Menu;
import com.example.projet0.entities.Restaurant;
import com.example.projet0.entities.TypeMenu;
import com.example.projet0.repositories.MenuRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
@AllArgsConstructor
public class MenuServiceImpl implements IMenuService{
    MenuRepository menuRepository;
    @Override
    public Menu addMenu(Menu e) {
        return menuRepository.save(e);
    }

    @Override
    public Menu updateMenu(Menu e) {
        return menuRepository.save(e);
    }

    @Override
    public Menu retrieveMenu(Long idMenu) {
        Optional<Menu> menu = menuRepository.findById(idMenu);
        return menu.orElseThrow(() -> new RuntimeException("Menu not found for id: " + idMenu));
    }

    @Override
    public void removeMenu(Long idMenu) {
        menuRepository.deleteById(idMenu);
    }

    @Override
    public List<Menu> retrieveAllMenus() {
        return (List<Menu>) menuRepository.findAll();
    }

    @Override
    public List<Menu> addMenus(List<Menu> menus) {
        return (List<Menu>) menuRepository.saveAll(menus);
    }

    public Restaurant ajoutRestaurantEtMenuAssocies(Restaurant restaurant){
        return null;
    }

    @Override
    public Menu ajoutComposantEtMiseAJourPrixTotal(Long idMenu, Set<Composant> composants) {

     /*   Menu menu = menuRepository.findById(idMenu).orElseThrow(() -> new RuntimeException("Menu not found for id: " + idMenu));
        float prixTotal = 0;
        for (Composant composant : composants) {
            prixTotal += composant.getPrix();
        }
        if (prixTotal <= 20) {
            menu.setComposants(composants);
            menu.setPrixTotal(prixTotal);
            return menuRepository.save(menu);
        } else {
            throw new RuntimeException("Le prix total ne doit pas depasser 20");
        }
*/return null;
    }

    @Override
    public List<String> nomMenuParTypeMenuOrdonneParPrixTotal(TypeMenu typeMenu) {
        return menuRepository.findNomMenuParTypeMenuOrdonneParPrixTotal(typeMenu);
    }



}
