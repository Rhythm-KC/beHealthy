package com.rhythm.resources;

import org.bson.types.ObjectId;
import org.mindrot.jbcrypt.BCrypt;

import com.rhythm.dao.Mongo.UserDAO;
import com.rhythm.models.Mongo.User;;

public class UserService {


    private final UserDAO userDao;   

    public UserService (UserDAO userDAO){
      this.userDao = userDAO;
    }

    public User getUser(ObjectId userId){
        return this.userDao.getUserById(userId);

    }

    public User getUser(String username){
        return this.userDao.getUserByName(username);
    }

    public void signup(String userName, String password, String email) throws Exception{

        String hasedP = BCrypt.hashpw(password, BCrypt.gensalt());
        User usr = new User();
        usr.setEmail(email).setPassword(hasedP).setUsername(userName);
    }

    public Boolean login(String UserName, String password){
        User usr = userDao.getUserByName(UserName);
        if (usr.equals(null)){
            return false;
        }
        String hassp = usr.getPassword();
        return BCrypt.checkpw(password, hassp);
    }

}
