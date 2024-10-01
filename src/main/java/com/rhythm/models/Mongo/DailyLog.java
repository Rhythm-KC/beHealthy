package com.rhythm.models.Mongo;

import java.util.Date;
import java.util.List;


public class DailyLog{

    private Date logTime;
    private List<Meal> meal;

    public Date getDate() {
        return logTime;
    }
    public void setDate(Date logTime) {
        this.logTime = logTime;
    }
    public List<Meal> getMeal() {
        return meal;
    }
    
}
