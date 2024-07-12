package com.example.weather_forecast.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.weather_forecast.exception.CityNotFoundException;
import com.example.weather_forecast.model.Weather;
import com.example.weather_forecast.service.WeatherService;

@Controller
public class WebController {
    @Autowired
    private WeatherService weatherService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/getWeather")
    public String getWeather(@RequestParam String city, Model model) {
        try {
            Weather weather = weatherService.getWeather(city);
            model.addAttribute("weather", weather);
            return "weather";
        } catch (CityNotFoundException e) {
            model.addAttribute("error", e.getMessage());
            return "error";
        }
    }

    @ExceptionHandler(CityNotFoundException.class)
    public String handleCityNotFoundException(CityNotFoundException e, Model model) {
        model.addAttribute("error", e.getMessage());
        return "error";
    }
}
