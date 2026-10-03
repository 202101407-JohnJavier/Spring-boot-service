package com.iacademy.stats.resource;

import com.iacademy.stats.service.StatsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stats")
@RequiredArgsConstructor
public class StatsResource {

    private final StatsService statsService;


    @PostMapping
    public double getAverage(@RequestBody String[] numbers){
        return statsService.getAverage(numbers);

    }
}
