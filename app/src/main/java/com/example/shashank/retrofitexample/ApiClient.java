package com.example.shashank.retrofitexample;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by shashank on 26-08-2017.
 */

public class ApiClient {

    public static final String JSON_WS_URL = "http://uat.wipro.cburls.com:6060/sfaweb-1.1.015/get/products/109983/";

    public static Retrofit retrofit = null;

    public static Retrofit getApiClient(){

        if (retrofit == null){

            retrofit = new Retrofit.Builder().baseUrl(JSON_WS_URL).
                    addConverterFactory(GsonConverterFactory.create()).build();

        }
        return retrofit;
    }


}
