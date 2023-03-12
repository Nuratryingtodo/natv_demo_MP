package com.example.natv_demoMP2.Services.impl;

import com.example.natv_demoMP2.DTOs.ChannelDTO;
import com.example.natv_demoMP2.DTOs.PriceDTO;
import com.example.natv_demoMP2.Entitys.Channels;
import com.example.natv_demoMP2.Entitys.Prices;
import com.example.natv_demoMP2.Enums.Statuses;
import com.example.natv_demoMP2.Mappers.PriceMapper;
import com.example.natv_demoMP2.Repositorys.PricesRepo;
import com.example.natv_demoMP2.Services.PriceService;
import com.example.natv_demoMP2.Utils.DateUtil;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PriceServiceImpl implements PriceService {
    private final PriceMapper priceMapper;
    private  final PricesRepo pricesRepo;
    public PriceServiceImpl(PriceMapper priceMapper, PricesRepo pricesRepo) {
        this.priceMapper = priceMapper;
        this.pricesRepo = pricesRepo;
    }

    @Override
    public void save(ChannelDTO channelDTO, Channels channel) {
        Prices price=priceMapper.toEntity(channelDTO.getPriceDTO());
        price.setStatus(Statuses.ACTIVE);
        price.setChannels(channel);
        price.setEndDate(DateUtil.getInstance().getEndDate());
        pricesRepo.save(price);

    }
}
