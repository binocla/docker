package com.orioninc;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Set;

@Path("/binocla")
public class WeatherResource {
    @ConfigProperty(name = "api_key")
    String API_KEY;

    @Inject
    @RestClient
    WeatherService weatherService;

    @GET
    @Path("{weather}")
    @Produces(MediaType.APPLICATION_JSON)
    public Weather getWeather(@PathParam("weather") String city) {
        return weatherService.getByCity(city, API_KEY);
    }
}