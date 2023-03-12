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
@NoArgsConstructor
@Table(name = "discounts")
public class Discounts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "from_day_count")
    Integer fromDayCount;
    @Column(name = "discount")
    Double discount;
    @Column(name = "discount_status")
    @Enumerated(EnumType.STRING)
    Statuses status;
    @Column(name = "start_date")
    @CreationTimestamp
    Date stratDate;
    @Column(name = "end_date")
    Date endDate;

    @ManyToOne()
    @JoinColumn(name = "channels_id")
    Channels channels;



}
