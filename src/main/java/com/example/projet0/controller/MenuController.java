package com.example.projet0.controller;


import com.example.projet0.entities.Menu;
import com.example.projet0.entities.TypeMenu;
import com.example.projet0.entities.Typecomposant;
import com.example.projet0.repositories.MenuRepository;
import com.example.projet0.services.IMenuService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Menu")
public class MenuController {
    IMenuService menuService;

    @Autowired
    MenuRepository menuRepository;

    @GetMapping("/get-all-menus")
    public List<Menu> getMenus(){
        return menuService.retrieveAllMenus();
    }

    @GetMapping("get-menu/{menu-id}")
    public Menu getMenu(@PathVariable("menu-id") Long menuId) {
        return menuService.retrieveMenu(menuId);
    }

    @DeleteMapping("/remove-menu/{menu-id}")
    public void removeMenu(@PathVariable("menu-id") Long menuId) {
        menuService.removeMenu(menuId);
    }

    @PutMapping("/update-menu")
    public Menu updateMenu(@RequestBody Menu c) {
        return menuService.updateMenu(c);
    }

    @PostMapping("/add-menu")
    public Menu addMenu(@RequestBody Menu c) {
        return menuService.addMenu(c);
    }

    @GetMapping("/get-menu-by-type-menu-and-prix-total-greater-than/{type-menu}/{prix}")
    public List<Menu> getMenuByTypeMenuAndPrixTotalGreaterThan(@PathVariable("type-menu") String typeMenu, @PathVariable("prix") Float prix) {
        return menuRepository.findByTypeMenuAndPrixTotalGreaterThan(TypeMenu.valueOf(typeMenu), prix);
    }

    @GetMapping("/get-menu-by-type-menu-and-order-by-prix-total/{type-menu}")
    public List<Menu> getMenuByTypeMenuAndOrderByPrixTotal(@PathVariable("type-menu") String typeMenu) {
        return menuRepository.findByTypeMenuAndOrderByPrixTotal(TypeMenu.valueOf(typeMenu));
    }

    @GetMapping("/get-menu-by-type-composant/{type-composant}")
    public List<Menu> getMenuByTypeComposant(@PathVariable("type-composant") String typeComposant) {
        return menuRepository.findByTypeComposant(Typecomposant.valueOf(typeComposant));
    }

    @GetMapping("/get-menu-by-type-menu/{type-menu}")
    public List<Menu> getMenuByTypeMenu(@PathVariable("type-menu") String typeMenu) {
        return menuRepository.findByTypeMenuAndOrderByPrixTotal(TypeMenu.valueOf(typeMenu));
    }

}
