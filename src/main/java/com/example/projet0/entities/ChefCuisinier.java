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
public class ChefCuisinier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idChefCuisinier;

    String nom;

    String prenom;

    @Enumerated(EnumType.STRING)
    TypeChef typeChef;

    @ManyToMany(mappedBy = "chefCuisiniers")
    Set<Menu> menus;
}
