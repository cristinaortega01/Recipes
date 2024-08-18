package com.recipes.model;

import java.util.List;

public class Recipe {
    private String name;
    private Category category;
    private List<Ingredient> ingredients;
    private List<Instruction> instructions;

    //constructor to initialize the object
    public Recipe(String name,Category category, List<Ingredient> ingredients, List<Instruction> instructions) {
        this.name = name;
        this.category = category;
        this.ingredients = ingredients;
        this.instructions = instructions;
    }

    // Getters and Setters
    public String getName (){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory(){
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<Instruction> getInstructions() {
        return instructions;
    }

    public void setInstructions(List<Instruction> instructions) {
        this.instructions = instructions;
    }

    @Override
    public String toString() {
        StringBuilder ingredientblock = new StringBuilder("\n");
        for ( int i = 0; i < ingredients.size(); i++) {
            ingredientblock.append(ingredients.get(i)).append("\n");
        }
        StringBuilder instructionsblock = new StringBuilder("\n");
        for ( int i = 0; i < instructions.size(); i++) {
            instructionsblock.append(instructions.get(i)).append("\n");
        }
        return "Name: " + name + " \nCategory: " + category + " \nIngredients: " + ingredientblock + "Instructions: " + instructionsblock;

    }
}

