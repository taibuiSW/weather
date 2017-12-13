package vn.artcraft.weather.ui.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import vn.artcraft.weather.R;
import vn.artcraft.weather.ui.fragment.WeatherDetailsFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        WeatherDetailsFragment weatherView = new WeatherDetailsFragment();
        ft.add(R.id.fragment_container, weatherView, "weather_view");
        ft.commit();
    }
}

