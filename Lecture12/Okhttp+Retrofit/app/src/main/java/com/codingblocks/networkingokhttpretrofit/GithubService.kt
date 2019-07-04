package com.codingblocks.networkingokhttpretrofit

import retrofit2.Call
import retrofit2.http.GET

interface GithubService {
    /**
     * Api me se get and post krne ke liye interface
     * end point is added in a constant
     */
    @GET("search/users?q=%22Pulkit%20Aggarwal%22")
    fun listUsers(): Call<GIthubResponse>

    @GET("search/users?q=%22Pulkit%20Aggarwal%22")
    fun listRepos(): Call<GIthubResponse>
}