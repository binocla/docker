package com.orioninc;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.Set;

@Path("")
@RegisterRestClient
public interface WeatherService {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    Weather getByCity(@QueryParam("q") String city, @QueryParam("appid") String appId);
}
