package com.example.motazelshaer.mosbyrxtest.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.motazelshaer.mosbyrxtest.Models.Item;
import com.example.motazelshaer.mosbyrxtest.R;

/**
 * Created by motazelshaer on 8/2/16.
 */
public class UsersListViewAdapter extends ArrayAdapter<Item> {
    public UsersListViewAdapter(Context context, int resource, Item[] objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.item_view, null, false);
        TextView textView = (TextView) view.findViewById(R.id.text);
        textView.setText(getItem(position).getName());
        return view;
    }
}
