package com.codepath.apps.restclienttemplate.models;

import org.json.JSONObject;

public class Tweet {

    public String body;
    public String createdAt;
    public User user;   //user associates with the tweet.

    public static Tweet fromJson(JSONObject jsonObject){
        Tweet tweet = new Tweet();
        tweet.body = jsonObject.getString("text");
        tweet.createdAt = jsonObject.getString("created_at");
        tweet.user = User.fromJson(jsonObject.getJSONObject("id"));
        return tweet;
    }
}
