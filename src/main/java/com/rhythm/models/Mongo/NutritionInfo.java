package com.rhythm.models.Mongo;

public class NutritionInfo {

    private int protein;
    private int carbs;
    private int fats;
    private int calories;


    public int getProtein() {
        return protein;
    }
    public void setProtine(int protein) {
        this.protein = protein;
    }
    public int getCarbs() {
        return carbs;
    }
    public void setCarbs(int carbs) {
        this.carbs = carbs;
    }
    public int getFats() {
        return fats;
    }
    public void setFats(int fats) {
        this.fats = fats;
    }
    public int getCalories() {
        return calories;
    }
    public void setCalories(int calories) {
        this.calories = calories;
    }

    public NutritionInfo getNutritionInfo(int totalServing, int servingSize) throws Exception{
        if (servingSize <= 0){
            throw new Exception("Serving size cannot be less than Zero but got: " +servingSize);
        }
        var info = new NutritionInfo();
        info.calories = this.calories * (totalServing/servingSize);
        info.protein= this.protein * (totalServing/servingSize);
        info.carbs = this.carbs *(totalServing/servingSize);
        info.fats = this.fats * (totalServing/servingSize);
        return info;
    }

    public void addInfo(NutritionInfo info){
        this.calories += info.getCalories();
        this.fats += info.getFats();
        this.protein += info.getProtein();
        this.carbs += info.getCarbs();
    }

}
