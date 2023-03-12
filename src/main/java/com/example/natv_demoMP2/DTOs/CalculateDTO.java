package com.example.natv_demoMP2.DTOs;

import com.example.natv_demoMP2.Entitys.Dates;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.apache.catalina.LifecycleState;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CalculateDTO {
    String text;
    Integer daysCount;
    Integer channelId;
    Double price;
    Double priceWithDiscount;
    List<Dates> days;





}
