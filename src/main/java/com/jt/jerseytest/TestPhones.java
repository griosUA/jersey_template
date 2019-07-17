/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jt.jerseytest;

import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.jt.jerseytest.Phones;

/**
 *
 * @author grisha
 */
@Path("/phonetest")
public class TestPhones {
  @GET
  @Path("/phones")
  @Produces(MediaType.APPLICATION_JSON)
  
    public ArrayList<Phones> getPhoneList(){
        return getPhones();
    }
    
    private ArrayList<Phones> getPhones(){
       ArrayList<Phones> phoneList = new ArrayList<Phones>();
        Phones ph1 = new Phones();
        ph1.setName("Samsung");
        ph1.setOs("Adnroid");
        ph1.setPrice(250);
        phoneList.add(ph1);
        
        Phones ph2 = new Phones();
        ph2.setName("LG");
        ph2.setOs("Adnroid");
        ph2.setPrice(350);
        phoneList.add(ph2);
        
        Phones ph3 = new Phones();
        ph3.setName("Iphone");
        ph3.setOs("IOs");
        ph3.setPrice(500);
        phoneList.add(ph3);
            
        return phoneList;
    }

}
