package com.example.natv_demoMP2.Entitys;

import com.example.natv_demoMP2.Enums.Statuses;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Table(name = "channels")
public class Channels{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "channel_name")
    String channelName;
    @Column(name = "channel_status")
    @Enumerated(EnumType.STRING)
    Statuses status;
    @Column(name="logo_path")
    String logo;
    @Column(name = "start_date")
    @CreationTimestamp
    Date startDate;
    @Column(name = "end_date")
    Date endDate;


    @OneToMany(mappedBy = "channels", cascade = CascadeType.PERSIST)
    List<Discounts> discountsList;
    @OneToOne(mappedBy = "channels", cascade = CascadeType.PERSIST)
    Prices pricePerLetter;



}
