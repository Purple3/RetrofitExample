package com.purple3.retrofitexample;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Belal on 10/2/2017.
 */

public interface Api {


    String BASE_URL = "https://api.themoviedb.org/3/discover/";

    @GET("movie/")
    Call<MovieDetailsResponse> getHeroes(@Query("api_key") String apiKey);
}