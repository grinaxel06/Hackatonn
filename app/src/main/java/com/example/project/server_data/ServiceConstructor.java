package com.example.project.server_data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceConstructor {
    private static final String DB_URL = "https://vbbxm.localtonet.com/";
    private static final String YANDEX_URL = "http://geocode-maps.yandex.ru/1.x/?apikey=40d1649f-0493-4b70-98ba-98533de7710b&geocode=Москва,+Красная+пл-дь,+1&format=json";
    public static <T> T CreateService(Class<T> serviceClass){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(DB_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(serviceClass);
    }
    public static <T> T CreateService_yandex(Class<T> serviceClass){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(YANDEX_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(serviceClass);
    }
}