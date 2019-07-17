/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jt.jerseytest;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author grisha
 */
//http://localhost:8080/jerseytest/rest/testservice

@Path("/testservice")
public class TestService {

    public String msg = "Hello World!";
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getTestService() {
        return msg;
    }
    

    

}
