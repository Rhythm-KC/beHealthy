package com.rhythm.models.Mongo;

import org.bson.types.ObjectId;


import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import dev.morphia.annotations.Indexes;
import dev.morphia.annotations.Index;
import dev.morphia.annotations.Field;

@Entity
@Indexes({
    @Index(fields = @Field("username")),
})
public class User{

    @Id
    private ObjectId id; 
    private String username;
    private String password;
    private String email;

    public String getEmail() {
        return email;
    }
    public User setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getUsername() {
        return username;
    }
    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }
    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    
}
