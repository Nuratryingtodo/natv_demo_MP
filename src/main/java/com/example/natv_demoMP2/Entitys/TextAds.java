package com.example.natv_demoMP2.Entitys;

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
@Table(name = "text_ad")
public class TextAds {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;
    @Column(name="text")
    String  text;
    @Column(name = "start_date")
    @CreationTimestamp
    Date stratDate;
    @Column(name = "end_date")
    Date endDate;


    @OneToMany(mappedBy = "textAds")
    List<TextOrder> textOrderList;




}
