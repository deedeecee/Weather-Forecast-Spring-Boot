package com.example.weather_forecast.service;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {
    private String name;
    private List<WeatherDetails> weather;
    private MainDetails main;

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<WeatherDetails> getWeather() {
        return weather;
    }

    public void setWeather(List<WeatherDetails> weather) {
        this.weather = weather;
    }

    public MainDetails getMain() {
        return main;
    }

    public void setMain(MainDetails main) {
        this.main = main;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class WeatherDetails {
        private String description;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class MainDetails {
        private double temp;

        public double getTemp() {
            return temp;
        }

        public void setTemp(double temp) {
            this.temp = temp;
        }
    }
}
