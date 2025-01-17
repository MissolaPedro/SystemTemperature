package st.GetInformations;

import com.google.gson.annotations.SerializedName;

public class WeatherData {
    @SerializedName("results")
    private Results results;

    public String formatWeatherData() {
        return "Dados:\n" +
                "Cidade: " + results.getCity() + "\n" +
                "- Temperatura: " + results.getTemp() + "°C\n" +
                "- Clima: " + results.getCondition() + "\n" +
                "- Data: " + results.getDate();
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "results=" + results +
                '}';
    }

    public static class Results {
        @SerializedName("city_name")
        private String city;

        @SerializedName("temp")
        private int temp;

        @SerializedName("date")
        private String date;

        @SerializedName("condition_slug")
        private String conditionSlug;

        public String getCity() {
            return city;
        }

        public int getTemp() {
            return temp;
        }

        public String getDate() {
            return date;
        }

        public String getCondition() {
            switch (conditionSlug) {
                case "storm":
                    return "Tempestade";
                case "snow":
                    return "Neve";
                case "hail":
                    return "Granizo";
                case "rain":
                    return "Chuva";
                case "fog":
                    return "Neblina";
                case "clear_day":
                    return "Dia Limpo";
                case "clear_night":
                    return "Noite Limpa";
                case "cloud":
                    return "Nublado";
                case "cloudly_day":
                    return "Nublado de Dia";
                case "cloudly_night":
                    return "Nublado de Noite";
                default:
                    return "Desconhecido";
            }
        }
    }
}
