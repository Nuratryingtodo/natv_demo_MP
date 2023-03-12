package com.example.natv_demoMP2.Mappers;

import com.example.natv_demoMP2.DTOs.ChannelDTO;
import com.example.natv_demoMP2.Entitys.Channels;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ChannelsMapper extends BaseMapper<Channels,ChannelDTO> {


    @Mapping(source = "logo", target = "logo")
    Channels toEntity(ChannelDTO channelDTO);

}
