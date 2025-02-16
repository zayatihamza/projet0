package com.example.projet0.services;

import com.example.projet0.entities.Menu;

import java.util.List;

public interface IMenuService {
    public Menu addMenu(Menu e);
    public Menu updateMenu(Menu e);
    public Menu retrieveMenu(Long idMenu);
    public void removeMenu(Long idMenu);
    public List<Menu> retrieveAllMenus();
    public List<Menu> addMenus(List<Menu> menus);
}
