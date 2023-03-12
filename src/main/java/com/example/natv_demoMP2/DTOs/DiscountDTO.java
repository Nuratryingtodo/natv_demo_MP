package com.example.natv_demoMP2.DTOs;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DiscountDTO {
    Long discountId;
    Integer fromDayCount;
    Integer discount;

}
