package com.example.natv_demoMP2.Mappers;

import com.example.natv_demoMP2.DTOs.ChannelDTO;
import com.example.natv_demoMP2.DTOs.DiscountDTO;
import com.example.natv_demoMP2.Entitys.Channels;
import com.example.natv_demoMP2.Entitys.Discounts;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface DiscountMapper extends BaseMapper<Discounts, DiscountDTO>{
//    @Mapping(source = "fromDayCount", target = "fromDayCount")
//    Discounts toEntity(DiscountDTO discountDTO);
}
