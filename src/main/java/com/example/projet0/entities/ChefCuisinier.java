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
public class ChefCuisinier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChefCuisinier;

    private String nom;

    private String prenom;

    @Enumerated(EnumType.STRING)
    private TypeChef typeChef;

    @ManyToMany(mappedBy = "chefCuisiniers")
    private Set<Menu> menus;
}
