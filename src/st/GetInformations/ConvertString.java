package st.GetInformations;

import java.io.BufferedReader;
import java.io.IOException;

public class ConvertString {
    public static String convertJsonToWeatherData(BufferedReader bufferedReader) throws IOException {
        StringBuilder json = new StringBuilder();
        String respost;
        while ((respost = bufferedReader.readLine()) != null) {
            json.append(respost);
        }
        return json.toString();
    }
}
