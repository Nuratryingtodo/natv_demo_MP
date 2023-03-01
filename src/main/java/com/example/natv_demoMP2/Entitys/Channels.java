package com.example.natv_demoMP2.Entitys;

import com.example.natv_demoMP2.Enums.Statuses;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@Table(name = "channels")
public class Channels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "channel_name")
    String channelName;
    @Column(name = "channel_status")
    @Enumerated(EnumType.STRING)
    Statuses status;
    @Column(name="logo_path")
    String logoPath;
    @OneToMany(mappedBy = "channels")
    List<Discounts> discountsList;
    @OneToMany(mappedBy = "channels")
    List<Prices> pricesList;



}
