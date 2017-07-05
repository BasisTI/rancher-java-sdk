package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.*;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface ServiceService{

  @GET("services")
  Call<TypeCollection<Service>> list();

  @GET("services")
  Call<TypeCollection<Service>> list(@QueryMap Filters filters);

  @GET("services/{id}")
  Call<Service> get(@Path("id") String id);

  @POST("services")
  Call<Service> create(@Body Service service);

  @PUT("services/{id}")
  Call<Service> update(@Path("id") String id, @Body Service service);

  @DELETE("services/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("services/{id}?action=activate")
  Call<Service> activate(@Path("id") String id);
  
  @POST("services/{id}?action=addservicelink")
  Call<Service> addservicelink(@Path("id") String id, @Body AddRemoveServiceLinkInput addRemoveServiceLinkInput);
  
  @POST("services/{id}?action=cancelupgrade")
  Call<Service> cancelupgrade(@Path("id") String id);
  
  @POST("services/{id}?action=continueupgrade")
  Call<Service> continueupgrade(@Path("id") String id);
  
  @POST("services/{id}?action=deactivate")
  Call<Service> deactivate(@Path("id") String id);
  
  @POST("services/{id}?action=finishupgrade")
  Call<Service> finishupgrade(@Path("id") String id);
  
  @POST("services/{id}?action=remove")
  Call<Service> remove(@Path("id") String id);
  
  @POST("services/{id}?action=removeservicelink")
  Call<Service> removeservicelink(@Path("id") String id, @Body AddRemoveServiceLinkInput addRemoveServiceLinkInput);
  
  @POST("services/{id}?action=restart")
  Call<Service> restart(@Path("id") String id, @Body ServiceRestart serviceRestart);
  
  @POST("services/{id}?action=rollback")
  Call<Service> rollback(@Path("id") String id);
  
  @POST("services/{id}?action=setservicelinks")
  Call<Service> setservicelinks(@Path("id") String id, @Body SetServiceLinksInput setServiceLinksInput);
  
  @POST("services/{id}?action=upgrade")
  Call<Service> upgrade(@Path("id") String id, @Body ServiceUpgrade serviceUpgrade);
  
}
