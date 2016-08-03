package com.example.motazelshaer.mosbyrxtest.Presenters;

import android.util.Log;

import com.example.motazelshaer.mosbyrxtest.Models.UsersResponse;
import com.example.motazelshaer.mosbyrxtest.Network.API;
import com.example.motazelshaer.mosbyrxtest.Views.UsersListViewInterface;
import com.hannesdorfmann.mosby.mvp.MvpPresenter;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by motazelshaer on 8/2/16.
 */
public class ListOfUsersPresenter implements MvpPresenter<UsersListViewInterface> {
    UsersListViewInterface view;

    @Override
    public void attachView(UsersListViewInterface view) {
        this.view = view;
    }

    @Override
    public void detachView(boolean retainInstance) {

    }

    public void loadData() {
        String BASE_URL = "https://www.touchdevelop.com/api/";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        API api = retrofit.create(API.class);
        Call call = api.getUsers();
        call.enqueue(new Callback() {
            @Override
            public void onResponse(Call call, Response response) {
                if (response.isSuccessful()) {
                    view.setData((UsersResponse) response.body());
                }
            }

            @Override
            public void onFailure(Call call, Throwable t) {
                Log.d("Retrofit", t.getMessage());
            }
        });

    }
}
