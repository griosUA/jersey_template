/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jt.jerseytest;

import java.util.Map;
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
@Path("/books")
public class TestBook {
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/{id}")

  public Response getAllBooks(@PathParam("id") int bookId){
    Book book = new Book();
    book.setId(bookId);
    book.setName("Book Name");
    book.setAuthorName("Book Author");
    return Response.status(200)
           .entity(book).build();
  }
}
