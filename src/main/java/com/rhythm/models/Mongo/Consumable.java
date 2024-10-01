package com.rhythm.models.Mongo;

public interface Consumable {
    public NutritionInfo getNutritionInfo(int servingSize) throws Exception;
}
