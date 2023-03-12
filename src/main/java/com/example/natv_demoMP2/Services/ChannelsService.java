package com.example.natv_demoMP2.Services;

import com.example.natv_demoMP2.DTOs.ChannelDTO;
import com.example.natv_demoMP2.Entitys.Channels;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ChannelsService {
    List<Channels> getAllChannels();

    List<ChannelDTO> getChannelsAc();

    ResponseEntity<?> createChannel(ChannelDTO channelDTO);

    Channels findById(Long id);
}
