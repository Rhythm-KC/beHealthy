package com.rhythm;


import com.rhythm.api.UserController;
import com.rhythm.db.MongoDB;
import com.rhythm.db.dao.Mongo.UserDAO;
import com.rhythm.resources.UserService;

import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;

public class TrackHealthyApplication extends Application<TrackHealthyConfiguration> {

    public static void main(final String[] args) throws Exception {
        new TrackHealthyApplication().run(args);
    }

    @Override
    public String getName() {
        return "TrackHealthy";
    }

    @Override
    public void initialize(final Bootstrap<TrackHealthyConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final TrackHealthyConfiguration configuration, final Environment environment) {

        MongoDB db = new MongoDB();
        UserDAO userDOA = new UserDAO(db.getDatastore());
        UserService usrService = new UserService(userDOA);
        UserController userController = new UserController(usrService);

        environment.jersey().register(userController);

    }
    
    

}
