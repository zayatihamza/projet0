package com.example.projet0.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;


import java.util.List;
import java.util.Date;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table( name = "Client")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Client {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idClient")
    Long idClient; // Clé primaire

    String identifiant;

    @Temporal(TemporalType.DATE)
    Date datePremiereVisite;

    @OneToMany(mappedBy = "client")
    List<Commande> commandes;


}