package com.bsav157.aplicacioncontactos.restApi;

import com.bsav157.aplicacioncontactos.restApi.model.ContactoResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface EndpointsApi {

    @GET(ConstantesRestApi.URL_GET_RECENT_MEDIA_USER)
    Call<ContactoResponse> getRecentMedia();
}
