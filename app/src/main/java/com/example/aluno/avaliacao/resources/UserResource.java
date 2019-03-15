package com.example.aluno.avaliacao.resources;

import com.example.aluno.avaliacao.model.User;

import java.util.List;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;

/**
 * Created by bruno on 28/09/18.
 */


public interface UserResource {

    @GET("users")
    Call<List<User>> get();

    @POST("user")
    Call<User> post(@Body User user);

    @PUT("user")
    Call<User> put(@Body User user);

    @DELETE("user")
    Call<Void> delete(@Body User user);
}
