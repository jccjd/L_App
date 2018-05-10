package com.example.lenovo.l_app.net;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.List;

public class RetrofitUtil {
    private static void getNews(Callback<HttpResult<List<News>>> callback) {
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://10.0.2.2")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ApiService apiService = retrofit.create(ApiService.class);
        Call<HttpResult<List<News>>> call = apiService.getNews();
        call.enqueue(callback);
    }
}
