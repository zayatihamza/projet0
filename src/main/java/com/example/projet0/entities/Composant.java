package com.example.projet0.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Composant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idComposant;

    String nomComposant;

    float prix;

    @ManyToOne
    Menu menu;

    @OneToOne
    DetailComposant detailcomposant;
}
