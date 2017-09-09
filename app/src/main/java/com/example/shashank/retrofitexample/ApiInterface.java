package com.example.shashank.retrofitexample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by shashank on 09-09-2017.
 */

public interface ApiInterface {

    @GET("GJW017")
    Call<List<ItemModel>>getItemList();
}
