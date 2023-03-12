package com.example.natv_demoMP2.Controllers;

import com.example.natv_demoMP2.DTOs.CalculateDTO;
import com.example.natv_demoMP2.DTOs.TextOrderDTO;
import com.example.natv_demoMP2.Entitys.Channels;
import com.example.natv_demoMP2.Services.TextOrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/v1")
public class TextOrderController {
private final TextOrderService textOrderService;

    public TextOrderController(TextOrderService textOrderService) {
        this.textOrderService = textOrderService;
    }
    @GetMapping("/channel/calculate")
    public CalculateDTO getCalculate(@RequestBody CalculateDTO calculateDTO){
       textOrderService.calculate(calculateDTO);
       return calculateDTO;
    }


/*    @PostMapping("/order/save")
public ResponseEntity<TextOrderDTO> save(@RequestBody TextOrderDTO textOrderDTO){
        textOrderService.save(textOrderDTO);
        return ResponseEntity.ok(textOrderDTO);}*/




}
