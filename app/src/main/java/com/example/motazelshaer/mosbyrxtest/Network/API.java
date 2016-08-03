package com.example.motazelshaer.mosbyrxtest.Network;

import com.example.motazelshaer.mosbyrxtest.Models.UsersResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by motazelshaer on 8/2/16.
 */
public interface API {
    @GET("users")
    public Call<UsersResponse> getUsers();
}
