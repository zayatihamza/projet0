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
public class Menu {
    @Id
    private Long idMenu;

    private String libelleMenu;

    @Enumerated(EnumType.STRING)
    private TypeMenu typeMenu;

    private float prixTotal;

    @OneToMany(mappedBy = "menu")
    private Set<Commande> commande;

    @ManyToMany
    private Set<ChefCuisinier> chefCuisiniers;

    @OneToMany(mappedBy = "menu")
    private Set<Composant> composants;
}
