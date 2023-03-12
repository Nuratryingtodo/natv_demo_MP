package com.example.natv_demoMP2.Entitys;

import com.example.natv_demoMP2.DTOs.PriceDTO;
import com.example.natv_demoMP2.Enums.Statuses;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

@Component
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "prices")
public class Prices{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name="price_per_letter")
    Double pricePerLetter;

    @OneToOne
    @JoinColumn(name = "channels_id")
    Channels channels;
    @Column(name = "start_date")
    @CreationTimestamp
    Date stratDate;
    @Column(name = "end_date")
    Date endDate;
    @Enumerated(EnumType.STRING)
    Statuses status;





}
