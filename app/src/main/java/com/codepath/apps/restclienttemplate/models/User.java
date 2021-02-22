package com.codepath.apps.restclienttemplate.models;

import org.json.JSONObject;

public class User {

    public String name;
    public String screenName;
    public String publicImageUrl;

    public static User fromJson (JSONObject jsonObject){
         User user = new User();
         user.name = jsonObject.getString("name");
         user.screenName = jsonObject.getString("screen_name");
         return user;
    }
}
