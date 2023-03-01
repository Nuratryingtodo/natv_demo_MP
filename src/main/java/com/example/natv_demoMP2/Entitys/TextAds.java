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
@Table(name = "text_ad")
public class TextAds {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;
    @Column(name="text")
    String  text;



}
