package com.example.motazelshaer.mosbyrxtest.Views;

import com.example.motazelshaer.mosbyrxtest.Models.UsersResponse;
import com.hannesdorfmann.mosby.mvp.MvpView;

/**
 * Created by motazelshaer on 8/2/16.
 */
public interface UsersListViewInterface extends MvpView {
    void setData(UsersResponse usersResponse);
}
