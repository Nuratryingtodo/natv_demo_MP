package com.example.natv_demoMP2.Services.impl;

import com.example.natv_demoMP2.DTOs.CalculateDTO;
import com.example.natv_demoMP2.DTOs.ChannelDTO;
import com.example.natv_demoMP2.DTOs.DiscountDTO;
import com.example.natv_demoMP2.Entitys.Channels;
import com.example.natv_demoMP2.Entitys.Discounts;
import com.example.natv_demoMP2.Enums.Statuses;
import com.example.natv_demoMP2.Mappers.DiscountMapper;
import com.example.natv_demoMP2.Repositorys.DiscountsRepo;
import com.example.natv_demoMP2.Services.DiscountService;
import com.example.natv_demoMP2.Utils.DateUtil;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class DiscountServiceImpl implements DiscountService {
    private final DiscountMapper discountMapper;
    private  final DiscountsRepo discountsRepo;

    public DiscountServiceImpl(DiscountMapper discountMapper, DiscountsRepo discountsRepo) {
        this.discountMapper = discountMapper;
        this.discountsRepo = discountsRepo;
    }


    @Override
    public void saveAll(ChannelDTO channelDTO, Channels channel) {
        List<Discounts> discountList=discountMapper.toEntityList(channelDTO.getDiscountDTOS());
        discountList.stream().forEach((discounts -> {
            discounts.setEndDate(DateUtil.getInstance().getEndDate());
            discounts.setChannels(channel);
            discounts.setStatus(Statuses.ACTIVE);}));
        discountsRepo.saveAll(discountList);

    }

}
