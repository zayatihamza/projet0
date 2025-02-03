package com.example.projet0.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChaineRestauration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChaineRestauration;

    private String libelle;

    private LocalDate dateCreation;

    @OneToMany(mappedBy = "chaineRestauration")
    private Set<Restaurant> restaurants;

}
