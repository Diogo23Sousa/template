package com.project.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("template")
public interface TemplateController {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    String templateMethod();

    @Path("/main")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    String templateMethodMain();

}

