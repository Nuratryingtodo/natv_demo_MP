package com.example.natv_demoMP2.Services.impl;

import com.example.natv_demoMP2.DTOs.CalculateDTO;
import com.example.natv_demoMP2.DTOs.TextOrderDTO;
import com.example.natv_demoMP2.Entitys.Channels;
import com.example.natv_demoMP2.Entitys.Discounts;
import com.example.natv_demoMP2.Entitys.Prices;
import com.example.natv_demoMP2.Entitys.TextOrder;
import com.example.natv_demoMP2.Enums.Statuses;
import com.example.natv_demoMP2.Mappers.TextOrderMapper;
import com.example.natv_demoMP2.Services.ChannelsService;
import com.example.natv_demoMP2.Services.TextOrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Comparator;
import java.util.Optional;
import java.util.function.Function;

@Service
public class TextOrderServiceImpl implements TextOrderService {
    private final ChannelsService channelsService;
    private final TextOrderMapper textOrderMapper;

    public TextOrderServiceImpl(ChannelsService channelsService, TextOrderMapper textOrderMapper) {
        this.channelsService = channelsService;
        this.textOrderMapper = textOrderMapper;
    }



@Transactional
    @Override
    public CalculateDTO calculate(CalculateDTO calculateDTO) {
        String text=calculateDTO.getText().replaceAll("\\s+", " ");
        double symbolCount = calculateDTO.getText().replaceAll("\\s+", "").length();
        Channels channel = channelsService.findById(Long.valueOf(calculateDTO.getChannelId()));
        Prices prices = channel.getPricePerLetter();
        Double price = symbolCount * prices.getPricePerLetter() * calculateDTO.getDaysCount();
        try{
            Function<Channels, Double> addDiscount = pd -> {
                Optional<Discounts> applicableDiscounts = channel.getDiscountsList()
                        .stream()
                        .filter(d -> calculateDTO.getDaysCount()>=d.getFromDayCount())
                        .max(Comparator.comparing(Discounts::getFromDayCount));
                Double discount= applicableDiscounts.get().getDiscount();
                double priceAddPrice=price-((price%100)*discount);
                return priceAddPrice;
            };
            Double priceWithDiscount = addDiscount.apply(channel);
            calculateDTO.setPriceWithDiscount(priceWithDiscount);
        } catch (Exception e){e.getStackTrace();
        }
        calculateDTO.setText(text);
        calculateDTO.setPrice(price);
        return calculateDTO;
    }

/*
    @Override
    public TextOrderDTO save(TextOrderDTO textOrderDTO) {
        TextOrder textOrder= (TextOrder) textOrderMapper.toEntity(textOrderDTO);
         textOrder.setStatus(Statuses.ACTIVE);
         CalculateDTO calculateDTO= (CalculateDTO) textOrderMapper.toEntity(textOrderDTO);
         calculateDTO.setText(textOrderDTO.getTextAds());
         calculateDTO.setDaysCount((int) calculateDTO.getDays()
                 .stream().count());




        return null;
    }
*/


}
