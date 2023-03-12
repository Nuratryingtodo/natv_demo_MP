package com.example.natv_demoMP2.Services;

import com.example.natv_demoMP2.DTOs.CalculateDTO;
import com.example.natv_demoMP2.DTOs.TextOrderDTO;
import org.springframework.stereotype.Service;

@Service
public interface TextOrderService {



    CalculateDTO calculate(CalculateDTO calculateDTO);

   // TextOrderDTO save(TextOrderDTO textOrderDTO);
}
