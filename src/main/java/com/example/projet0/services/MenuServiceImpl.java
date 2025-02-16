package com.example.projet0.services;

import com.example.projet0.entities.Menu;
import com.example.projet0.repositories.MenuRepository;

import java.util.List;
import java.util.Optional;

public class MenuServiceImpl implements IMenuService{
    MenuRepository menuRepository;
    public MenuServiceImpl(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }
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

}
