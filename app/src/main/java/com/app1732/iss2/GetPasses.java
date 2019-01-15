package com.app1732.iss2;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Url;

public interface GetPasses{
    @Headers("Content-Type: text/plain")
    @GET()
    Call<Example> getjson(@Url String url);
}
