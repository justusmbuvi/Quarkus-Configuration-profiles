package com.config;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/hello")
public class ExampleResource {

    @ConfigProperty(name = "person.name")
    String name;

    @ConfigProperty(name = "person.age")
    String age;

    @ConfigProperty(name = "person.height")
    String height;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }

    @Path("/person")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String person() {
        return "The person is " + name + " of age " + age + " yrs and of height of " + height + " cm";
    }
}