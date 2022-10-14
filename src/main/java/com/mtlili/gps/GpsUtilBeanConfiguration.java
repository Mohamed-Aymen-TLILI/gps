package com.mtlili.gps;

import gpsUtil.GpsUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GpsUtilBeanConfiguration {

    @Bean
    public GpsUtil gpsUtil()
    {
        return new GpsUtil();
    }
}
