package com.example.projet0.controller;

import com.example.projet0.entities.Composant;
import com.example.projet0.services.IComposantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Composant")
public class ComposantController {
    IComposantService composantService;
    @GetMapping("/get-all-composants")
    public List<Composant> getComposants(){
        return composantService.retrieveAllComposants();
    }

    @GetMapping("get-composant/{composant-id}")
    public Composant getComposant(@PathVariable("composant-id") Long composantId) {
        return composantService.retrieveComposant(composantId);
    }

    @PostMapping("/add-composant")
    public Composant addComposant(@RequestBody Composant c) {
        return composantService.addComposant(c);
    }

    @DeleteMapping("/remove-composant/{composant-id}")
    public void removeComposant(@PathVariable("composant-id") Long composantId) {
        composantService.removeComposant(composantId);
    }

    @PutMapping("/update-composant")
    public Composant updateComposant(@RequestBody Composant c) {
        return composantService.updateComposant(c);
    }
}
