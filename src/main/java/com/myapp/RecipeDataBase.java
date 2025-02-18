package com.myapp;

import java.util.ArrayList;
import java.util.HashMap;

public class RecipeDataBase {
    public HashMap<String, String> Name = new HashMap<>();
    public HashMap<String, String> Ingredients = new HashMap<>();
    public HashMap<String, String> Instructions = new HashMap<>();
    public ArrayList<Integer> TimeToMake = new ArrayList<>();


    public void addRecipe(Attributes attributes) {
        Name.put(attributes.getNameAttribute(), attributes.getNameAttribute());
        Ingredients.put(attributes.getIngredientAttribute(), attributes.getIngredientAttribute());
        Instructions.put(attributes.getInstructionAttribute(), attributes.getInstructionAttribute());
        TimeToMake.add(attributes.getTimeAttribute());
    }

}

