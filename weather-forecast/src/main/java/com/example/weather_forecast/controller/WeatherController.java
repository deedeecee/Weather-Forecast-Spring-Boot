package com.example.weather_forecast.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.weather_forecast.model.Weather;
import com.example.weather_forecast.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class WeatherController {
    @Autowired
    private WeatherService weatherService;

    @GetMapping("/weather")
    public Weather getWeather(@RequestParam String city) {
        return weatherService.getWeather(city);
    }

}
