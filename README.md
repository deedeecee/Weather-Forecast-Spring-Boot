# Weather-Forecast-Spring-Boot
## Description
The Weather Forecast Application is a Spring Boot web application that allows users to get weather forecasts for a specified city. The application retrieves weather data from the [Visual Crossing Weather API](https://www.visualcrossing.com/weather-api) and displays the current weather, including a description and temperature in both Fahrenheit and Celsius. Users can toggle between Fahrenheit and Celsius temperatures on the results page.

## Features
* Retrieve weather forecasts for any city.
* Display the weather description, temperature in Fahrenheit and Celsius.
* Toggle between Fahrenheit and Celsius temperatures.
* Handle cases where the city is not found and display appropriate error messages.

## Technologies Used
* Java
* Spring Boot
* Thymeleaf
* Visual Crossing Weather API
* HTML/CSS
* Bootstrap

## Prerequisites
* Java 8 or higher
* Maven
* Visual Crossing Weather API Key

## Getting Started

### Clone the Repository

```bash
git clone https://github.com/deedeecee/Weather-Forecast-Spring-Boot.git
cd Weather-Forecast-Spring-Boot/weather-forecast
```

### Setup the API Key
1. Sign up for an API key from [Visual Crossing Weather](https://www.visualcrossing.com/sign-up)
2. Open the `application.properties` file located in `src/main/resources/`.
3. Add your API key to the file:
```properties
weather.api.key=YOUR_API_KEY
weather.api.url=https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline
```

### Build and Run the Application
```bash
mvn clean install
mvn spring-boot:run
```
The application will start on (http://localhost:8080).

### Usage
1. Open your web browser and navigate to http://localhost:8080.
2. Enter the name of the city you want to get the weather forecast for and click "Get Weather".
3. The application will display the weather forecast including the city name, description, and temperature in Fahrenheit.
4. Click the "Toggle to °C" button to switch the temperature to Celsius, and vice versa.

### Error Handling
If the city name entered does not exist, an error page will be displayed with an appropriate error message.

### Project Structure
```css
weather-forecast-app/
├── src/main/java/com/example/weatherforecast/
│   ├── controller/
│   │   └── WeatherController.java
│   ├── exception/
│   │   └── CityNotFoundException.java
│   ├── model/
│   │   └── Weather.java
│   ├── service/
│   │   └── WeatherService.java
│   └── WeatherForecastApplication.java
├── src/main/resources/
│   ├── static/
│   │   └── css/
│   │       └── style.css
│   ├── templates/
│   │   ├── error.html
│   │   ├── index.html
│   │   └── weather.html
│   └── application.properties
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml
```

## Acknowledgements
* [Visual Crossing](https://www.visualcrossing.com/)
* [Spring Boot](https://spring.io/projects/spring-boot)
* [Thymeleaf](https://www.thymeleaf.org/)
* [Bootstrap](https://getbootstrap.com/)
