package com.auwfar.mysunshineindonesia;

/**
 * Created by Auwfar on 11-Nov-17.
 */

public class Weather {
    private int weatherImage;
    private String weatherDate;
    private String weatherDesc;
    private String weatherTemperature;

    public Weather(int weatherImage, String weatherDate, String weatherDesc, String weatherTemperature) {
        this.weatherImage = weatherImage;
        this.weatherDate = weatherDate;
        this.weatherDesc = weatherDesc;
        this.weatherTemperature = weatherTemperature;
    }

    public int getWeatherImage() {
        return weatherImage;
    }

    public String getWeatherDate() {
        return weatherDate;
    }

    public String getWeatherDesc() {
        return weatherDesc;
    }

    public String getWeatherTemperature() {
        return weatherTemperature;
    }
}
