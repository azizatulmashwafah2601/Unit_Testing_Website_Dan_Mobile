package com.example.veilitionapp.API;

import com.example.veilitionapp.model.login.Login;
import com.example.veilitionapp.model.register.Register;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface APIInterface {

    @FormUrlEncoded
    @POST("login.php")
    Call<Login> loginResponse(
            @Field("email_pelanggan") String email,
            @Field("password_pelanggan") String password
    );

    @FormUrlEncoded
    @POST("register.php")
    Call<Register> registerResponse(
            @Field("email_pelanggan") String email,
            @Field("password_pelanggan") String password,
            @Field("nama_pelanggan") String nama,
            @Field("telepon_pelanggan") String telepon,
            @Field("alamat_pelanggan") String alamat
    );
}
