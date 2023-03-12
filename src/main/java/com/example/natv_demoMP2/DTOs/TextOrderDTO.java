package com.example.natv_demoMP2.DTOs;

import com.example.natv_demoMP2.Entitys.Channels;
import com.example.natv_demoMP2.Entitys.TextAds;
import com.example.natv_demoMP2.Enums.Statuses;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TextOrderDTO {
    String clientEmail;
    String clientFIO;
    String clientPhone;
    String textAds;
    Statuses status;
    Double totalPrice;
    List<CalculateDTO> channels;








}
