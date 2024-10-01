package com.rhythm;

import io.dropwizard.core.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.rhythm.db.MongoDB.MongoDBConfig;

import jakarta.validation.constraints.NotEmpty;

public class TrackHealthyConfiguration extends Configuration {
    @NotEmpty
    private String template;

    @NotEmpty
    private String defaultName = "beHealthy";

    @JsonProperty("mongodb")
    private MongoDBConfig mongoDBConfig;

    @JsonProperty
    public String getTemplate() {
        return template;
    }

    @JsonProperty
    public void setTemplate(String template) {
        this.template = template;
    }

    @JsonProperty
    public String getDefaultName() {
        return defaultName;
    }

    @JsonProperty
    public void setDefaultName(String name) {
        this.defaultName = name;
    }
    public MongoDBConfig getMongoDBConfig(){
        return this.mongoDBConfig;
    }
}
