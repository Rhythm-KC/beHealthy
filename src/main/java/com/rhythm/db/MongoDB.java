package com.rhythm.db;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

import dev.morphia.Datastore;
import dev.morphia.Morphia;
import io.dropwizard.core.Configuration;

public class MongoDB extends Configuration{

    @JsonProperty("mongodb")
    private MongoDBConfig mongoDBConfig;
    
    public MongoDBConfig getMongoDBConfig(){
        return mongoDBConfig;
    }

    public Datastore getDatastore(){
        MongoClient client = MongoClients.create("mongodb://" + 
                                                 mongoDBConfig.getHost() + ":" + 
                                                 mongoDBConfig.getPort());

        Datastore store = Morphia.createDatastore(client, "beHealthy");
        store.getMapper().mapPackage("com.rhythm.models");
        store.ensureIndexes();
        return store;
    }

    public static class MongoDBConfig{
        private String host;
        private int port;
        private String database;


        public String getHost(){
            return host;
        }
        public int getPort(){
            return port;
        }
        public String getDatabase(){
            return database;
        }

    }
}
