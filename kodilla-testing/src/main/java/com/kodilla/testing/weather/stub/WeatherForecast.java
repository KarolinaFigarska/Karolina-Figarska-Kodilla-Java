package com.kodilla.testing.weather.stub;


import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double averageTemperature() {
        double sum =0;

        Map<String, Double> temperatures = this.temperatures.getTemperatures();
        for (Map.Entry<String, Double> temperature : temperatures.entrySet()) {
            sum = sum + temperature.getValue();
        }
        return sum/ temperatures.size();
    }

    public double medianTemperature() {
        double median;

        List<Double> listOfTemperatures = new ArrayList<>(temperatures.getTemperatures().values());

        Collections.sort(listOfTemperatures);
        double middleElement = listOfTemperatures.get((listOfTemperatures.size()-1)/2);
        if (listOfTemperatures.size() % 2 ==0) {
            median = (middleElement + listOfTemperatures.get(((listOfTemperatures.size()-1/2)-1)))/2;
        } else {
            median = middleElement;
        }
        return median;
    }
}
