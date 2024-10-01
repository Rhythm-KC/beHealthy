package com.rhythm.models.Mongo;

public class Ingredient implements Consumable {

    private String Name;
    private String UnitOfMeasurement;
    private int TotalServing;
    private NutritionInfo nutritionInfo;

   
    public String getName() {
        return Name;
    }


    public void setName(String name) {
        Name = name;
    }


    public String getUnitOfMeasurement() {
        return UnitOfMeasurement;
    }


    public void setUnitOfMeasurement(String unitOfMeasurement) {
        UnitOfMeasurement = unitOfMeasurement;
    }


    public int getTotalServing() {
        return TotalServing;
    }


    public void setTotalServing(int totalServing) {
        TotalServing = totalServing;
    }


    @Override
    public NutritionInfo getNutritionInfo(int servingSize) throws Exception{
        return this.nutritionInfo.getNutritionInfo(TotalServing, servingSize);
    }


    public void setNutritionInfo(NutritionInfo nutritionInfo) {
        this.nutritionInfo = nutritionInfo;
    }


    
}
