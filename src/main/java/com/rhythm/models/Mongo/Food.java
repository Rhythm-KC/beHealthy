package com.rhythm.models.Mongo;

public class Food {
    public int serving_size;
    public Consumable food;
    

    public NutritionInfo getNutritionInfo() throws Exception{
        return food.getNutritionInfo(serving_size);
        

    }
}
