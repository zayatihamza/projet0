package com.example.projet0.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Composant {
    @Id
    private Long idComposant;
    private String nomComposant;
    private float prix;

    @ManyToOne
    private Menu menu;

    @OneToOne
    private Detailcomposant detailcomposant;
}
