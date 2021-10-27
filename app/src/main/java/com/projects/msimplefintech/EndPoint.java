package com.projects.msimplefintech;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface EndPoint {
    @GET("api.php?")
    Call<List<Model>>getData(@Query("account_number") String account_number, @Query("bank_code") int bank_code);
}
