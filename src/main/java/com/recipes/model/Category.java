package com.recipes.model;

import java.util.List;

public class Category {
    private String name;
    private List<Recipe> recipes;

    public Category( String name, List<Recipe> recipes) {
        this.name = name;
        this.recipes = recipes;
    }

    public String getName (){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
    }

    @Override
    public String toString() {
        return name;

    }
}
