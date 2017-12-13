package vn.artcraft.weather.utils;

import android.support.annotation.NonNull;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

public class ServiceGenerator {
    private static final String BASE_URL = "http://api.apixu.com/";
    private static final String APP_ID = "50d8cfea8d9546548c735908170712";

    private static OkHttpClient.Builder httpClient =
            new OkHttpClient.Builder().addInterceptor(new Interceptor() {
                @Override
                public Response intercept(@NonNull Chain chain) throws IOException {
                    Request original = chain.request();
                    HttpUrl httpUrl = original.url();
                    HttpUrl newHttpUrl = httpUrl.newBuilder()
                            .addQueryParameter("key", APP_ID)
                            .build();
                    Request newRequest = original.newBuilder().url(newHttpUrl).build();
                    return chain.proceed(newRequest);
                }
            });

    private static Retrofit.Builder builder =
            new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(httpClient.build())
                    .addConverterFactory(MoshiConverterFactory.create());

    private static Retrofit retrofit = builder.build();

    public static <S> S createService(Class<S> serviceClass) {
        return retrofit.create(serviceClass);
    }

}
