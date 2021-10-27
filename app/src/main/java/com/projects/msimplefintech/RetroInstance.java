package com.projects.msimplefintech;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroInstance {
    private static final String BaseUrl ="https://maylancer.org/api/nuban/";
    public Retrofit retrofit;

    public Retrofit getInstance(){
        if (retrofit ==null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BaseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
       return retrofit;
    }

}
