package com.example.natv_demoMP2.DTOs;

import com.example.natv_demoMP2.Entitys.Channels;
import com.example.natv_demoMP2.Entitys.Discounts;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class ChannelDTO implements Comparable{
    Long channelId;
    String channelName;
    String logo;
    PriceDTO priceDTO;
    List<DiscountDTO> discountDTOS;

    @Override
    public int compareTo(Object channelDTO) {

        try {
            return this.channelName.compareTo(String.valueOf(channelDTO.getClass().getDeclaredField(channelName)));
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }

    }


   /* public ChannelDTO(ChannelDTO channelDTO, List<DiscountDTO> discountsDTOS, PriceDTO priceDTO) {
        this.channelId = channelDTO.getChannelId();
        this.channelName = channelDTO.getChannelName();
        this.logo = channelDTO.getLogo();
        this.priceDTO = new PriceDTO(priceDTO.getPricePerLetter());
        this.discountDTOS = discountsDTOS.st;
    }*/


}
