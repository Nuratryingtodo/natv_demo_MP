package com.example.natv_demoMP2.Entitys;

import com.example.natv_demoMP2.Enums.Statuses;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "text_orders")
public class TextOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "client_fio")
    String clientFIO;
    @Column(name = "client_phone")
    String clientPhone;
    @Column(name="client_email")
    String client_email;
    @Column(name="status")
    @Enumerated(EnumType.STRING)
    Statuses status;
    @Column(name = "start_date")
    @CreationTimestamp
    Date stratDate;
    @Column(name = "end_date")
    Date endDate;

    @ManyToOne( cascade = CascadeType.PERSIST)
    @JoinColumn(name = "dates_id")
    Dates days;
    @ManyToOne( cascade = CascadeType.PERSIST)
    @JoinColumn(name = "text_ads_id")
    TextAds textAds;







}
