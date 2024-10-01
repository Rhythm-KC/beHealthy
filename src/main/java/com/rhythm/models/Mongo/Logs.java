package com.rhythm.models.Mongo;

import java.util.List;

import org.bson.types.ObjectId;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Field;
import dev.morphia.annotations.Id;
import dev.morphia.annotations.Index;
import dev.morphia.annotations.Indexes;
import dev.morphia.annotations.Reference;


@Entity
@Indexes({
    @Index(fields = @Field("user")),
})
public class Logs
{

    @Id
    private ObjectId _id;

    @Reference
    private User user;


    private List<DailyLog> logs;

    public List<DailyLog> getLogs() {
        return logs;
    }

    public void setLogs(List<DailyLog> logs) {
        this.logs = logs;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }



}
