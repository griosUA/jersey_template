/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jt.jerseytest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author grisha
 */
//http://localhost:8080/jerseytest/rest/testservice/hello
@Path("/testservice")
public class TestMessage {

    @GET
    @Path("/{param}")
    @Produces(MediaType.TEXT_HTML)
    public Response getMsg(@PathParam("param") String msg) {

        String output = "I say: " + msg;

        return Response.status(200).entity(output).build();

    }
}
