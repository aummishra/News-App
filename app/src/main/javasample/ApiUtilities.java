package com.example.newsapp;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

//Java class for creating API interface and utilities to create a Retrofit object.
public class ApiUtilities {
    //Take a Retrofit object, but here we need to add a dependency to see a Retrofit object
    private static Retrofit retrofit = null;
    //Creating API Interface, package -> new -> Interface(ApiInterface) -> add functions in it
    public static ApiInterface getApiInterface(){ //"getApiInterface" class of type "ApiInterface"
        if(retrofit == null){
            retrofit = new Retrofit.Builder().baseUrl(ApiInterface.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit.create(ApiInterface.class);
    }
}
