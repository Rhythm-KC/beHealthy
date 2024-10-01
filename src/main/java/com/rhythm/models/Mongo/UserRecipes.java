package com.rhythm.models.Mongo;

import java.util.List;

import org.bson.types.ObjectId;


import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import dev.morphia.annotations.Property;
import dev.morphia.annotations.Reference;

@Entity
public class UserRecipes implements Consumable{

    @Id
    private ObjectId _id;

    @Reference
    private User user;

    @Property
    private List<Ingredient> ingredients;

    @Property
    private int TotalServing;


    @Override
    public NutritionInfo getNutritionInfo(int servingSize) throws Exception {
        NutritionInfo info = new NutritionInfo();

        for (Ingredient food : ingredients) {
            info.addInfo(food.getNutritionInfo(food.getTotalServing()));
        }
        return info.getNutritionInfo(TotalServing, servingSize);

    }





    
}
