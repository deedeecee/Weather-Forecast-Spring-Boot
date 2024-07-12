package com.example.weather_forecast.service;

import com.example.weather_forecast.exception.CityNotFoundException;
import com.example.weather_forecast.model.Weather;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    @Value("${weather.api.key}")
    private String apiKey;

    @Value("${weather.api.url}")
    private String apiUrl;

    private final RestTemplate restTemplate = new RestTemplate();

    public Weather getWeather(String city) {
        String url = String.format("%s/%s?key=%s", apiUrl, city, apiKey);
        try {
            VisualCrossingResponse response = restTemplate.getForObject(url, VisualCrossingResponse.class);
            if (response != null && !response.getDays().isEmpty()) {
                VisualCrossingResponse.Day firstDay = response.getDays().get(0);
                return new Weather(
                    response.getResolvedAddress(),
                    firstDay.getDescription(),
                    firstDay.getTemp()
                );
            } else {
                throw new CityNotFoundException("City not found: " + city);
            }
        } catch (HttpClientErrorException e) {
            throw new CityNotFoundException("City not found: " + city);
        }
    }
}
