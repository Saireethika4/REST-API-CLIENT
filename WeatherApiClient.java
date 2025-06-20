import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
import org.json.JSONObject;

public class WeatherApiClient {

    public static void main(String[] args) {
        try {
            // Build the client and request
            HttpClient client = HttpClient.newHttpClient();
            String url = "https://api.open-meteo.com/v1/forecast?latitude=35&longitude=139&current_weather=true";
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            // Send request
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Parse JSON
            JSONObject json = new JSONObject(response.body());
            JSONObject currentWeather = json.getJSONObject("current_weather");

            // Display
            System.out.println("=== Current Weather Data ===");
            System.out.println("Temperature: " + currentWeather.getDouble("temperature") + " °C");
            System.out.println("Wind Speed: " + currentWeather.getDouble("windspeed") + " km/h");
            System.out.println("Wind Direction: " + currentWeather.getDouble("winddirection") + " °");
            System.out.println("Weather Code: " + currentWeather.getInt("weathercode"));
            System.out.println("Time: " + currentWeather.getString("time"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
