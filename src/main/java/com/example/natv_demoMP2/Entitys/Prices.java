package com.example.natv_demoMP2.Entitys;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@Table(name = "prices")
public class Prices {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name="price_per_letter")
    Double pricePerLetter;

    @ManyToOne
    @JoinColumn(name = "channels_id")
    Channels channels;





}
