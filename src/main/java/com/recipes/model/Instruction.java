package com.recipes.model;

public class Instruction {
    private String description;
    private int stepNumber;
    private Recipe recipe;


    public Instruction (int stepNumber, String description) {
        this.stepNumber = stepNumber;
        this.description = description;
    }

    @Override
    public String toString() {
        return stepNumber + " "+ description;

    }

}
