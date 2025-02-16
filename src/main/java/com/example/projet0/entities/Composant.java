package com.example.projet0.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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
    Long idComposant;
    String nomComposant;
    float prix;

    @ManyToOne
    Menu menu;

    @OneToOne
    Detailcomposant detailcomposant;
}
