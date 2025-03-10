package com.example.projet0.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "Menu")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMenu")
    Long idMenu;

    String libelleMenu;

    @Enumerated(EnumType.STRING)
    TypeMenu typeMenu;

    float prixTotal;

    @OneToMany(mappedBy = "menu")
    Set<Commande> commande;

    @ManyToMany
    Set<ChefCuisinier> chefCuisiniers;

    @OneToMany(mappedBy = "menu")
    Set<Composant> composants;
}
