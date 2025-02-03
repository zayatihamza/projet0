package com.example.projet0.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Detailcomposant {
    @Id
    private Long idDetailComposant;
    float imc;

    @Enumerated(EnumType.STRING)
    Typecomposant typeComposant;

    @OneToOne(mappedBy = "detailcomposant")
    private Composant composant;
}
