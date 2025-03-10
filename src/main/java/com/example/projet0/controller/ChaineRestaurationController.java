package com.example.projet0.controller;

import com.example.projet0.entities.ChaineRestauration;
import com.example.projet0.services.IChaineRestaurationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/chaine")
public class ChaineRestaurationController {
    IChaineRestaurationService chaineRestaurationService;

    @PostMapping("/add-chaine")
    public ChaineRestauration addChaine(@RequestBody ChaineRestauration c) { return chaineRestaurationService.addChaine(c);}

    @GetMapping("get-all-chaines")
    public List<ChaineRestauration> getAllChaines(){return chaineRestaurationService.retrieveAllChaines();}

    @GetMapping("/get-chaine/{chaine-id}")
    public ChaineRestauration getChaine(@PathVariable("chaine-id") Long chaineId) {return chaineRestaurationService.retrieveChaine(chaineId);}

    @PutMapping("/update-chaine")
    public ChaineRestauration updateChaine(@RequestBody ChaineRestauration c) {return chaineRestaurationService.updateChaine(c);}

    @DeleteMapping("/remove-chaine/{chaine-id}")
    public void removeChaine(@PathVariable("chaine-id") Long chaineId) {chaineRestaurationService.removeChaine(chaineId);}

}
