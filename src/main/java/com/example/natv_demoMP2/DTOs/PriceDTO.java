package com.example.natv_demoMP2.DTOs;

import com.example.natv_demoMP2.Entitys.Prices;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PriceDTO  {
    Long priceId;
    Double pricePerLetter;

}
