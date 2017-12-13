package vn.artcraft.weather.ui.fragment;

import android.support.annotation.NonNull;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import vn.artcraft.weather.pojos.WeatherData;
import vn.artcraft.weather.utils.OpenWeatherMapClient;
import vn.artcraft.weather.utils.ServiceGenerator;

public class WeatherDetailsPresenterImpl implements WeatherDetailsPresenter, Callback<WeatherData> {
    private WeatherDetailsView mWeatherView;
    private OpenWeatherMapClient mWeatherClient;

    WeatherDetailsPresenterImpl(WeatherDetailsView weatherView) {
        mWeatherView = weatherView;
        mWeatherClient = ServiceGenerator.createService(OpenWeatherMapClient.class);
    }

    @Override
    public void requestData(double lat, double lon) {
        mWeatherClient.getWeatherData(new double[]{lat, lon}).enqueue(this);
    }

    @Override
    public void onResponse(@NonNull Call<WeatherData> call, @NonNull Response<WeatherData> response) {
        WeatherData data = response.body();
        if (data != null) {
            mWeatherView.bindData(data);
        }
    }

    @Override
    public void onFailure(@NonNull Call<WeatherData> call, @NonNull Throwable t) {

    }
}
