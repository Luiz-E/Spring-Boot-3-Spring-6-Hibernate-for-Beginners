package com.luizedu.springcoredemo.config;

import com.luizedu.springcoredemo.common.Coach;
import com.luizedu.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }

}
