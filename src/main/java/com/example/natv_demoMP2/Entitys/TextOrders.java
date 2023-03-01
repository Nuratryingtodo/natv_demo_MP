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
@Table(name = "text_orders")
public class TextOrders {
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






}
