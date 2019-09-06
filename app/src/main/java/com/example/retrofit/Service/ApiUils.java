package com.example.retrofit.Service;

public class ApiUils {
    public  static final  String Baseurl = "http://go123.cf/";

    public static DataClient getData(){
    return  RetrofitClient.getClient(Baseurl).create(DataClient.class);
    }
}
