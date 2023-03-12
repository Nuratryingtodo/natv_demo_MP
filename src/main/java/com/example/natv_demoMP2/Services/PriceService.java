package com.example.natv_demoMP2.Services;

import com.example.natv_demoMP2.DTOs.ChannelDTO;
import com.example.natv_demoMP2.DTOs.PriceDTO;
import com.example.natv_demoMP2.Entitys.Channels;
import com.example.natv_demoMP2.Entitys.Prices;

public interface PriceService {
    void save(ChannelDTO channelDTO,Channels channel );
}
