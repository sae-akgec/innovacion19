package in.silive.innovacion19;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {

    // Relay 1 & 2
    @GET("relay1/{id}")
    Single<Object> relay1(@Path("id") int id);

    @GET("relay2/{id}")
    Single<Object> relay2(@Path("id") int id);

    @GET("led/{id}")
    Single<Object> led(@Path("id") int id);

    @GET("bot/{id}")
    Single<Object> bot(@Path("id") char id);

}
