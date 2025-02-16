package com.example.projet0.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChaineRestauration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idChaineRestauration;

    String libelle;

    LocalDate dateCreation;

    @OneToMany(mappedBy = "chaineRestauration")
    Set<Restaurant> restaurants;

}
