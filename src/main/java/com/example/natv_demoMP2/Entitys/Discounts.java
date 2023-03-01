package com.example.natv_demoMP2.Entitys;

import com.example.natv_demoMP2.Enums.Statuses;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@Table(name = "discounts")
public class Discounts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "from_day_count")
    Integer fromDyCount;
    @Column(name = "discount")
    Integer discount;
    @Column(name = "discount_status")
    @Enumerated(EnumType.STRING)
    Statuses status;

    @ManyToOne
    @JoinColumn(name = "channels_id")
    Channels channels;



}
