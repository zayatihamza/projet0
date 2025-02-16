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
    Long idRestaurant;

    String nom;

    Long nbPlacesMax;

    @ManyToOne
    ChaineRestauration chaineRestauration;

    @OneToMany
    Set<Menu> menus;
}
