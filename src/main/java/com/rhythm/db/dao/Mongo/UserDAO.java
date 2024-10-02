package com.rhythm.db.dao.Mongo;

import java.util.List;

import org.bson.types.ObjectId;

import com.rhythm.models.Mongo.User;

import dev.morphia.query.filters.Filters;
import dev.morphia.Datastore;
import jakarta.inject.Inject;

public class UserDAO{

    @Inject
    private final Datastore db;

    public UserDAO(Datastore db){
        this.db = db;
    }

    public void saveUser(User usr) throws Exception {
        this.db.save(usr);
    }

    public User getUserByName(String userName) {
        return this.db.find(User.class)
                      .filter(Filters.eq("username", userName))
                      .first();
    }

    public User getUserById(ObjectId userId) {
        return this.db.find(User.class)
                        .filter(Filters.eq("_id", userId))
                        .first();
    }

    public List<User> getUsers() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUsers'");
    }

    public void updateUser(User usr) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateUser'");
    }

    public void deleteUser(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
    }

}