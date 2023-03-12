package com.example.natv_demoMP2.Services.impl;

import com.example.natv_demoMP2.DTOs.ChannelDTO;
import com.example.natv_demoMP2.Entitys.Channels;
import com.example.natv_demoMP2.Entitys.Prices;
import com.example.natv_demoMP2.Enums.Statuses;
import com.example.natv_demoMP2.Mappers.ChannelsMapper;
import com.example.natv_demoMP2.Mappers.PriceMapper;
import com.example.natv_demoMP2.Repositorys.ChannelsRepo;
import com.example.natv_demoMP2.Services.ChannelsService;
import com.example.natv_demoMP2.Services.DiscountService;
import com.example.natv_demoMP2.Services.PriceService;
import com.example.natv_demoMP2.Utils.DateUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ChannelsServiceImpl implements ChannelsService {
    private final ChannelsRepo channelsRepo;
    private final ChannelsMapper channelsMapper;
    private final PriceService priceService;
    private final DiscountService discountService;
    private final PriceMapper priceMapper;

    public ChannelsServiceImpl(ChannelsRepo channelsRepo, ChannelsMapper channelsMapper, Prices prices, PriceService priceService, DiscountService discountService, PriceMapper priceMapper) {
        this.channelsRepo = channelsRepo;
        this.channelsMapper = channelsMapper;
        this.priceService = priceService;
        this.discountService = discountService;
        this.priceMapper = priceMapper;
    }

    @Override
    public List<Channels> getAllChannels() {
        List<Channels> channelsList= channelsRepo.findAll();
        return channelsList;


    }

    @Override
    public Channels findById(Long id) {
        return channelsRepo.findById(id).orElseThrow(() -> new IllegalArgumentException("Channel with id " + id + " not found"));
    }

    @Override
    public List<ChannelDTO> getChannelsAc() {
        List<Long> channelIds = getAllChannels()
                .stream()
                .map(Channels::getId)
                .collect(Collectors.toList());
        List<Channels> channelsList = channelsRepo.findAllByIdInAndStatus(channelIds, Statuses.ACTIVE);
        List<ChannelDTO> channelDTOList = channelsMapper.toDTOList(channelsList);
        // Collections.sort(channelDTOList);
        return channelDTOList;
    }

    @Override
    @Transactional
    public ResponseEntity<?> createChannel(ChannelDTO channelDTO) {
        Channels channel = channelsMapper.toEntity(channelDTO);
        //System.err.println(channel);x
        channel.setStatus(Statuses.ACTIVE);
        channel.setEndDate(DateUtil.getInstance().getEndDate());
        channelsRepo.save(channel);
        discountService.saveAll(channelDTO,channel);
        priceService.save(channelDTO, channel);
        return ResponseEntity.ok(channel);
    }




}
