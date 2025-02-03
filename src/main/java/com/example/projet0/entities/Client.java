package com.example.projet0.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
import java.util.Date;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table( name = "Client")
public class Client {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idClient")
    private Long idClient; // Clé primaire

    private String identifiant;

    @Temporal(TemporalType.DATE)
    private Date datePremiereVisite;

    @OneToMany(mappedBy = "client")
    private List<Commande> commandes;


}