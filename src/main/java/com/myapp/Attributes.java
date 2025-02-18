package com.myapp;

public class Attributes {
    private String nameAttribute;
    private String ingredientAttribute;
    private String instructionAttribute;
    private Integer timeAttribute;

    public Attributes(String nameAttribute, String ingredientAttribute, String instructionAttribute, Integer timeAttribute) {
        this.nameAttribute = nameAttribute;
        this.ingredientAttribute = ingredientAttribute;
        this.instructionAttribute = instructionAttribute;
        this.timeAttribute = timeAttribute;
    }


    public String getNameAttribute() {
        return nameAttribute;
    }
    public void setNameAttribute(String nameAttribute) {
        this.nameAttribute = nameAttribute;
    }


    public String getIngredientAttribute() {
        return ingredientAttribute;
    }
    public void setIngredientAttribute(String ingredientAttribute) {
        this.ingredientAttribute = ingredientAttribute;
    }


    public String getInstructionAttribute() {
        return instructionAttribute;
    }
    public void setInstructionAttribute(String instructionAttribute) {
        this.instructionAttribute = instructionAttribute;
    }


    public Integer getTimeAttribute() {
        return timeAttribute;
    }
    public void setTimeAttribute(Integer timeAttribute) {
        this.timeAttribute = timeAttribute;
    }
}