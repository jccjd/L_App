package com.example.lenovo.l_app.net;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface ApiService {
    @GET("getnews.php")
    Call<HttpResult<List<news>>>

}
