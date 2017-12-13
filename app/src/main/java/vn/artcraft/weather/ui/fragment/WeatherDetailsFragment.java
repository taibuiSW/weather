package vn.artcraft.weather.ui.fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnSuccessListener;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import vn.artcraft.weather.R;
import vn.artcraft.weather.pojos.Condition;
import vn.artcraft.weather.pojos.Current;
import vn.artcraft.weather.pojos.WeatherData;
import vn.artcraft.weather.utils.DateTimeFormatter;
import vn.artcraft.weather.utils.GlideApp;

public class WeatherDetailsFragment extends Fragment
        implements WeatherDetailsView, OnSuccessListener<Location> {

    private WeatherDetailsPresenter mPresenter;
    private FusedLocationProviderClient mLocationClient;
    private Unbinder mUnbinder;

    @BindView(R.id.txv_location)
    TextView mLocation;
    @BindView(R.id.txv_temperature)
    TextView mTemperature;
    @BindView(R.id.txv_humidity)
    TextView mHumidity;
    @BindView(R.id.txv_condition)
    TextView mCondition;
    @BindView(R.id.txv_date)
    TextView mDate;
    @BindView(R.id.txv_last_updated)
    TextView mLastUpdated;
    @BindView(R.id.img_condition)
    ImageView mImgCondition;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mLocationClient = LocationServices.getFusedLocationProviderClient(context);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mPresenter = new WeatherDetailsPresenterImpl(this);
        View view = inflater.inflate(R.layout.fragment_weather_details, container, false);
        mUnbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        getLocation();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mUnbinder.unbind();
    }

    @SuppressLint("MissingPermission")
    public void getLocation() {
        mLocationClient.getLastLocation().addOnSuccessListener(this);
    }

    @Override
    public void onSuccess(Location location) {
        if (location != null) {
            mPresenter.requestData(location.getLatitude(), location.getLongitude());
        }
    }

    @Override
    public void bindData(WeatherData data) {
        mLocation.setText(data.getLocation().getName());
        Current current = data.getCurrent();
        mTemperature.setText(String.valueOf(current.getTempC()));
        Condition condition = current.getCondition();
        mHumidity.setText(String.valueOf(current.getHumidity()));
        mCondition.setText(condition.getText());
        GlideApp.with(this)
                .load(condition.getIcon())
                .into(mImgCondition);
        DateTimeFormatter formatter = new DateTimeFormatter(current.getLastUpdated());
        mDate.setText(formatter.getFormattedDate());
        mLastUpdated.setText(formatter.getFormattedTime());
    }
}
