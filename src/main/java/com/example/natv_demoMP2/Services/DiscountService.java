package com.example.natv_demoMP2.Services;

import com.example.natv_demoMP2.DTOs.CalculateDTO;
import com.example.natv_demoMP2.DTOs.ChannelDTO;
import com.example.natv_demoMP2.Entitys.Channels;
import com.example.natv_demoMP2.Entitys.Discounts;

import java.util.List;

public interface DiscountService {
     void saveAll(ChannelDTO channelDTO, Channels channel);

}
