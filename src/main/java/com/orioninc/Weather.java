package com.orioninc;

import java.util.List;
import java.util.Map;

public class Weather {
    private List<Map<String, Object>> weather;
    private Map<String, Object> main;
    private Map<String, Object> coord;

    public List<Map<String, Object>> getWeather() {
        return weather;
    }

    public void setWeather(List<Map<String, Object>> weather) {
        this.weather = weather;
    }

    public Map<String, Object> getMain() {
        return main;
    }

    public void setMain(Map<String, Object> main) {
        this.main = main;
    }

    public Map<String, Object> getCoord() {
        return coord;
    }

    public void setCoord(Map<String, Object> coord) {
        this.coord = coord;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "weather=" + weather +
                ", main=" + main +
                ", coord=" + coord +
                '}';
    }
}
