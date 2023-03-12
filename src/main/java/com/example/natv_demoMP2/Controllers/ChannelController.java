package com.example.natv_demoMP2.Controllers;

import com.example.natv_demoMP2.DTOs.ChannelDTO;
import com.example.natv_demoMP2.Entitys.Channels;
import com.example.natv_demoMP2.Services.ChannelsService;
import com.example.natv_demoMP2.Services.TextOrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class ChannelController {
    private final ChannelsService channelsService;

    public ChannelController(ChannelsService channelsService, TextOrderService orderService) {
        this.channelsService = channelsService;
    }

    @PostMapping("/createChannel")
    public ResponseEntity<?> createChannel(@RequestBody ChannelDTO channelDTO){
        return ResponseEntity.ok(channelsService.createChannel(channelDTO));

    }

    @GetMapping("/getAllChannel")
    public List<Channels> getChannel() {
        return channelsService.getAllChannels();
    }
    @GetMapping("/getChannel")
    public List<ChannelDTO> getChannelsAc(){
        return  channelsService.getChannelsAc();
    }



}
