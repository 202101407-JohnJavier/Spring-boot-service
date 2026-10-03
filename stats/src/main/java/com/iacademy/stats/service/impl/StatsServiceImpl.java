package com.iacademy.stats.service.impl;

import com.iacademy.stats.service.StatsService;
import org.springframework.stereotype.Service;

@Service
public class StatsServiceImpl implements StatsService {

    @Override
    public double getAverage(String[] numbers) {
        if(numbers == null || numbers.length == 0){
            return 0;
        }
        double sum = 0;
        for (String number: numbers){
            double doubleNumber;
            try{
                doubleNumber = Double.parseDouble(number);
            }catch (NullPointerException | NumberFormatException e){
                doubleNumber = 0;
            }
            sum += doubleNumber;
        }
        return sum/numbers.length;
    }
}
