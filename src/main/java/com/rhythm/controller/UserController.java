package com.rhythm.controller;

import com.rhythm.models.Mongo.User;
import com.rhythm.resources.UserService;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/user")
public class UserController {
   
    private UserService service;

    public UserController(UserService service){
        this.service = service;
    }

    @POST()
    @Path("register")
    public Response register(User user){
        try {
            service.signup(user.getUsername(), user.getPassword(), user.getEmail());
            return Response.status(Response.Status.CREATED)
                           .entity("Created a new user for" + user.getUsername())
                           .build();
            
        } catch (Exception e) {
            return Response.status(Response.Status.CONFLICT)
                            .entity(e.getMessage())
                            .build();
        }
    }

    @POST()
    @Path("/login")
    public Response login(User user){
        if (service.login(user.getUsername(), user.getPassword())){
            return Response.status(Response.Status.OK)
                           .entity("Found user for" + user.getUsername())
                           .build();

        }
        return Response.status(Response.Status.UNAUTHORIZED).entity("Could not find object").build();
    }

}
