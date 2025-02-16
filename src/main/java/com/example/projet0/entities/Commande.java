package com.example.projet0.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idCommande;

    LocalDate dateCommande;

    Integer pourcentageRemise;

    Float totalRemise;

    Float totalCommande;

    Long note;

    @ManyToOne
    Client client;

    @ManyToOne
    Menu menu;





}
