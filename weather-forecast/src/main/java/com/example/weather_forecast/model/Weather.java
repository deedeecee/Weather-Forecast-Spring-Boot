package com.example.weather_forecast.model;

public class Weather {
    private String city;
    private String description;
    private double temperatureFahrenheit;
    private double temperatureCelsius;

    public Weather(String city, String description, double temperatureFahrenheit) {
        this.city = city;
        this.description = description;
        this.temperatureFahrenheit = temperatureFahrenheit;
        this.temperatureCelsius = (temperatureFahrenheit - 32) * 5 / 9;
    }

    // Getters and setters

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTemperatureFahrenheit() {
        return temperatureFahrenheit;
    }

    public void setTemperatureFahrenheit(double temperatureFahrenheit) {
        this.temperatureFahrenheit = temperatureFahrenheit;
        this.temperatureCelsius = (temperatureFahrenheit - 32) * 5 / 9;
    }

    public double getTemperatureCelsius() {
        return Math.round(temperatureCelsius * 10.0) / 10.0;
    }

    public void setTemperatureCelsius(double temperatureCelsius) {
        this.temperatureCelsius = temperatureCelsius;
    }
}
