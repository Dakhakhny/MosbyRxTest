package com.example.motazelshaer.mosbyrxtest.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by motazelshaer on 8/2/16.
 */
public class Item {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("haspicture")
    @Expose
    private Boolean haspicture;
    @SerializedName("time")
    @Expose
    private Integer time;
    @SerializedName("about")
    @Expose
    private String about;
    @SerializedName("receivedpositivereviews")
    @Expose
    private Integer receivedpositivereviews;
    @SerializedName("subscribers")
    @Expose
    private Integer subscribers;
    @SerializedName("isadult")
    @Expose
    private Boolean isadult;
    @SerializedName("avatar")
    @Expose
    private String avatar;

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

    /**
     * @return The id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The haspicture
     */
    public Boolean getHaspicture() {
        return haspicture;
    }

    /**
     * @param haspicture The haspicture
     */
    public void setHaspicture(Boolean haspicture) {
        this.haspicture = haspicture;
    }

    /**
     * @return The time
     */
    public Integer getTime() {
        return time;
    }

    /**
     * @param time The time
     */
    public void setTime(Integer time) {
        this.time = time;
    }

    /**
     * @return The about
     */
    public String getAbout() {
        return about;
    }

    /**
     * @param about The about
     */
    public void setAbout(String about) {
        this.about = about;
    }

    /**
     * @return The receivedpositivereviews
     */
    public Integer getReceivedpositivereviews() {
        return receivedpositivereviews;
    }

    /**
     * @param receivedpositivereviews The receivedpositivereviews
     */
    public void setReceivedpositivereviews(Integer receivedpositivereviews) {
        this.receivedpositivereviews = receivedpositivereviews;
    }

    /**
     * @return The subscribers
     */
    public Integer getSubscribers() {
        return subscribers;
    }

    /**
     * @param subscribers The subscribers
     */
    public void setSubscribers(Integer subscribers) {
        this.subscribers = subscribers;
    }

    /**
     * @return The isadult
     */
    public Boolean getIsadult() {
        return isadult;
    }

    /**
     * @param isadult The isadult
     */
    public void setIsadult(Boolean isadult) {
        this.isadult = isadult;
    }

    /**
     * @return The avatar
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * @param avatar The avatar
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

}