package com.example.projet0.controller;

import com.example.projet0.entities.DetailComposant;
import com.example.projet0.services.IDetailComposant;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Detail")
public class DetailComposantController {

    IDetailComposant detailComposantService;

    @GetMapping("/get-all-details")
    public List<DetailComposant> getDetails(){
        return detailComposantService.retrieveAllDetailcomposants();
    }

    @GetMapping("get-detail/{detail-id}")
    public DetailComposant getDetail(@PathVariable("detail-id") Long detailId) {
        return detailComposantService.retrieveDetailcomposant(detailId);
    }

    @PostMapping("/add-detail")
    public DetailComposant addDetail(@RequestBody DetailComposant c) {
        return detailComposantService.addDetailcomposant(c);
    }

    @DeleteMapping("/remove-detail/{detail-id}")
    public void removeDetail(@PathVariable("detail-id") Long detailId) {
        detailComposantService.removeDetailcomposant(detailId);
    }

    @PutMapping("/update-detail")
    public DetailComposant updateDetail(@RequestBody DetailComposant c) {
        return detailComposantService.updateDetailcomposant(c);
    }
}
