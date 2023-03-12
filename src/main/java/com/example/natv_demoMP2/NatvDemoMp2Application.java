package com.example.natv_demoMP2;

import com.example.natv_demoMP2.DTOs.ChannelDTO;
import com.example.natv_demoMP2.DTOs.PriceDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class  NatvDemoMp2Application {

	public static void main(String[] args) {
		SpringApplication.run(NatvDemoMp2Application.class, args);

		ObjectMapper objectMapper=new ObjectMapper();
		ChannelDTO channelDTO=new ChannelDTO(1L,"ynx","kxhcg ",new PriceDTO(1L,2.5),new ArrayList<>());
		String json;

		{
			try {
				json = objectMapper.writeValueAsString(channelDTO);
			} catch (JsonProcessingException e) {
				throw new RuntimeException(e);
			}
		}
		System.out.println(json);
	}

}
