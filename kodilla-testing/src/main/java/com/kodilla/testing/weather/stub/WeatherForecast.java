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
        double average =0;
        int counter=0;
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            counter++;
            average = average + temperature.getValue();
        }
        return average/counter;
    }

    public double medianTemperature() {
        List<Double> listOfTemperatures = new ArrayList<>();
        double median;
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            listOfTemperatures.add(temperature.getValue());
        }
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
