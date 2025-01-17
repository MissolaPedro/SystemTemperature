package st.GetInformations;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder; // Adicione esta importação
import java.nio.charset.StandardCharsets; // Adicione esta importação

import com.google.gson.Gson;

public class RequestAPI {
    private static final String apiUrl = "https://api.hgbrasil.com/weather?key=d472f141";
    private static final int successCode = 200;

    public String getWeatherData(String city) throws Exception {
        String urlForCall = apiUrl + "&city_name=" + URLEncoder.encode(city, StandardCharsets.UTF_8.toString());

        try {
            URL url = new URL(urlForCall);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            if (connection.getResponseCode() != successCode) {
                throw new RuntimeException("Failed : HTTP error code : " + connection.getResponseCode());
            }

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder jsonResponse = new StringBuilder();
            String responseLine;
            while ((responseLine = bufferedReader.readLine()) != null) {
                jsonResponse.append(responseLine);
            }

            connection.disconnect();

            return jsonResponse.toString();
        } catch (Exception e) {
            throw new Exception("Error on request API: " + e);
        }
    }
}
