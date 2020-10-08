package com.bsav157.aplicacioncontactos.restApi.adapter;

import com.bsav157.aplicacioncontactos.restApi.ConstantesRestApi;
import com.bsav157.aplicacioncontactos.restApi.EndpointsApi;
import com.bsav157.aplicacioncontactos.restApi.deserializador.ContactoDeserializador;
import com.bsav157.aplicacioncontactos.restApi.model.ContactoResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestApiAdapter {

    public EndpointsApi establecerConexionRestApiInstagram(Gson gson){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ConstantesRestApi.ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        return retrofit.create(EndpointsApi.class);
    }

    public Gson construyeGsonDeserializadorMediaRecent(){
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(ContactoResponse.class, new ContactoDeserializador());
        return gsonBuilder.create();
    }
}
