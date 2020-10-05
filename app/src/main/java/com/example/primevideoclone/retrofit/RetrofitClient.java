package com.example.primevideoclone.retrofit;

import androidx.constraintlayout.widget.ConstraintSet;

import com.google.android.exoplayer2.upstream.BandwidthMeter;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

public class RetrofitClient {

    private static final String BASE_URL="http://androidappsforyoutube.s3.ap-south-1.amazonaws.com/primevideo/api/";


    public static ApiInterface getRetrofitClient(){

        Retrofit.Builder builder=new Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .baseUrl(BASE_URL);

        return builder.build().create(ApiInterface.class);
    }


}
