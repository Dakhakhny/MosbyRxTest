package com.example.motazelshaer.mosbyrxtest.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by motazelshaer on 8/2/16.
 */
public class UsersResponse {

    @SerializedName("continuation")
    @Expose
    private String continuation;
    @SerializedName("v")
    @Expose
    private Integer v;
    @SerializedName("items")
    @Expose
    private List<Item> items = new ArrayList<Item>();
    @SerializedName("kind")
    @Expose
    private String kind;

    /**
     * @return The continuation
     */
    public String getContinuation() {
        return continuation;
    }

    /**
     * @param continuation The continuation
     */
    public void setContinuation(String continuation) {
        this.continuation = continuation;
    }

    /**
     * @return The v
     */
    public Integer getV() {
        return v;
    }

    /**
     * @param v The v
     */
    public void setV(Integer v) {
        this.v = v;
    }

    /**
     * @return The items
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     * @param items The items
     */
    public void setItems(List<Item> items) {
        this.items = items;
    }

    /**
     * @return The kind
     */
    public String getKind() {
        return kind;
    }

    /**
     * @param kind The kind
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

}