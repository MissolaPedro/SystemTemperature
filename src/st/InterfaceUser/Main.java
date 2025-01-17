package st.InterfaceUser;

import com.google.gson.Gson;
import st.GetInformations.RequestAPI;
import st.GetInformations.WeatherData;
public class Main {
    public static void main(String[] args) {
        System.out.println("---- Sistema de temperatura ----");
        System.out.println("Sistema experimental de temperatura");
        String city = "São Paulo";

        RequestAPI requestAPI = new RequestAPI();
        WeatherData weatherData = null;
        try {
            String jsonResponse = requestAPI.getWeatherData(city);
            weatherData = new Gson().fromJson(jsonResponse, WeatherData.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        if (weatherData != null) {
            System.out.println(weatherData.formatWeatherData());
        } else {
            System.out.println("Falha ao obter dados de clima.");
        }
    }
}