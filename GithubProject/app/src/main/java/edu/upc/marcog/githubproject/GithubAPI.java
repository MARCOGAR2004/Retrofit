package edu.upc.marcog.githubproject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GithubAPI {

    @GET("/users/{username}")
    Call<GithubUser> getUser(@Path("username") String username);

    @GET("/users/{username}/followers")
    Call<List<GithubFollowers>> getFollowers(@Path("username") String username);

}
