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
public class Detailcomposant {
    @Id
    Long idDetailComposant;
    float imc;

    @Enumerated(EnumType.STRING)
    Typecomposant typeComposant;

    @OneToOne(mappedBy = "detailcomposant")
    Composant composant;
}
