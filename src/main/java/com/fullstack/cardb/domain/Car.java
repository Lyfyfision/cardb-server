package com.fullstack.cardb.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @NotBlank
    @NonNull
    @Column(name = "model")
    private String model;

    @NotBlank
    @NonNull
    @Column(name = "brand")
    private String brand;

    @NotBlank
    @NonNull
    @Column(name = "color")
    private String color;

    @NotBlank
    @NonNull
    @Column(name = "regnumber")
    private String regNum;

    @NonNull
    @Column(name = "year")
    private int year;

    @NonNull
    @Column(name = "price")
    private int price;

    @Column(name = "explanation",length = 512)
    @NonNull
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @NonNull
    @JoinColumn(name = "owner")
    @Getter
    @Setter
    private Owner owner;
}
