package com.example.nearbyatm;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GitHubService {
  @GET("json?radius=1500&type=restaurant&keyword=cruise&key=AIzaSyAaHic4OeAav5J3XOlZpcQLFzfW-ye6wB4")
  Call<ApiResponse> listAtm(@Query("location") String location);
}