package com.example.natv_demoMP2.Entitys;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "dates")
public class Dates {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name="text_order_dates")
    Date textOrderDates;
    @OneToMany(mappedBy = "dates")
    List<TextOrder> textOrder;
}
