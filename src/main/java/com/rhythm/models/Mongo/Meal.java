package com.rhythm.models.Mongo;

import java.util.List;

import com.rhythm.utils.MealType;


public class Meal{

    private MealType type;
    private List<Food> foods;
    private int portionSize;

    public MealType getType() {
        return type;
    }
    public void setType(MealType type) {
        this.type = type;
    }
    public List<Food> getFood() {
        return foods;
    }
    public void setFood(List<Food> food) {
        this.foods = food;
    }
    public int getPortionSize() {
        return portionSize;
    }
    public void setPortionSize(int portionSize) {
        this.portionSize = portionSize;
    }

    public NutritionInfo getNutritionInfo() throws Exception{
        NutritionInfo info = new NutritionInfo();
        for (Food food: foods) {
           info.addInfo(food.getNutritionInfo()); 
        }

        return info;
    }
}
