package com.example.retrofit.Service;

import java.util.ArrayList;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface DataClient {

    // up hình bằng retrofit
    @Multipart
    @POST("")
    Call<ArrayList> UploadImage(@Part MultipartBody.Part Image);

    @FormUrlEncoded
    @POST
    Call<String> tenham(@Field("id") String id
            , @Field("token") String token
            , @Field("service_id") String service_id
            , @Field("latitude") String latitude
            , @Field("longitude") String longitude);
}
