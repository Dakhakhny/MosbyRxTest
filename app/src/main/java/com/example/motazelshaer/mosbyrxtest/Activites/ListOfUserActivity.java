package com.example.motazelshaer.mosbyrxtest.Activites;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.widget.ListView;

import com.example.motazelshaer.mosbyrxtest.Adapters.UsersListViewAdapter;
import com.example.motazelshaer.mosbyrxtest.Models.Item;
import com.example.motazelshaer.mosbyrxtest.Models.UsersResponse;
import com.example.motazelshaer.mosbyrxtest.Presenters.ListOfUsersPresenter;
import com.example.motazelshaer.mosbyrxtest.R;
import com.example.motazelshaer.mosbyrxtest.Views.UsersListViewInterface;
import com.hannesdorfmann.mosby.mvp.MvpActivity;

/**
 * Created by motazelshaer on 8/2/16.
 */
public class ListOfUserActivity extends MvpActivity<UsersListViewInterface, ListOfUsersPresenter> implements UsersListViewInterface {
    public ListView usersListView;
    public UsersListViewAdapter adapter;

    @NonNull
    @Override
    public ListOfUsersPresenter createPresenter() {
        return new ListOfUsersPresenter();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.users_list);
        usersListView = (ListView) findViewById(R.id.users_list);
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.loadData();
    }

    @Override
    public void setData(UsersResponse usersResponse) {
        adapter = new UsersListViewAdapter(this, 0, usersResponse.getItems().toArray(new Item[usersResponse.getItems().size()]));
        usersListView.setAdapter(adapter);
    }
}
