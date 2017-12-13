package vn.artcraft.weather.utils;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import vn.artcraft.weather.pojos.WeatherData;

public interface OpenWeatherMapClient {
    @GET("v1/current.json")
    Call<WeatherData> getWeatherData(@Query("q") double[] coord);
}
