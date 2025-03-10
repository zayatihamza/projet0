package com.example.projet0.controller;


import com.example.projet0.entities.ChefCuisinier;
import com.example.projet0.services.IChefService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Chef")
public class ChefCuisinierController {
    IChefService chefService;

@GetMapping("/get-all-chef")
public List<ChefCuisinier> getAllChef(){return chefService.retrieveAllChefs();}

@GetMapping("/get-chef/{chef-id}")
public ChefCuisinier getChef(@PathVariable("chef-id") Long chefId) {return chefService.retrieveChef(chefId);}

@DeleteMapping("/remove-chef/{chef-id}")
public void removeChef(@PathVariable("chef-id") Long chefId) { chefService.removeChef(chefId);}

@PostMapping("/add-chef")
public ChefCuisinier addChef(@RequestBody ChefCuisinier c) {return chefService.addChef(c);}

@PutMapping("/update-chef")
public ChefCuisinier updateChef(@RequestBody ChefCuisinier c) {return chefService.updateChef(c);}



}
