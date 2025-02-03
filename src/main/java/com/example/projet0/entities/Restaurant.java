package com.example.projet0.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRestaurant;

    private String nom;

    private Long nbPlacesMax;

    @ManyToOne
    ChaineRestauration chaineRestauration;

    @OneToMany
    private Set<Menu> menus;
}
