package com.recipes;

import com.recipes.model.Category;
import com.recipes.model.Ingredient;
import com.recipes.model.Instruction;
import com.recipes.model.Recipe;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Ingredient ingredient1 = new Ingredient("Mascarpone", 250, "gramos");
        Ingredient ingredient2 = new Ingredient("Philadelphia", 250, "gramos");
        Ingredient ingredient3 = new Ingredient("Azucar", 100, "gramos");
        Ingredient ingredient4 = new Ingredient("Huevo", 3, "");
        Ingredient ingredient5 = new Ingredient("Harina", 12.5 , "gramos");
        Ingredient ingredient6 = new Ingredient("Nata líquida", 250, "ml");

        List<Ingredient> tartaQueso = new ArrayList<>();
        tartaQueso.add(ingredient1);
        tartaQueso.add(ingredient2);
        tartaQueso.add(ingredient3);
        tartaQueso.add(ingredient4);
        tartaQueso.add(ingredient5);
        tartaQueso.add(ingredient6);

        Instruction instruction1 = new Instruction(1, "Mezcla todos los ingredientes en un bol.");
        Instruction instruction2 = new Instruction(2, "Vierte la mezcla en un molde.");
        Instruction instruction3 = new Instruction(3, "Hornea en el segundo de los cinco niveles del horno a 210 grados con calor arriba y abajo y sin aire durante 50 minutos. A los 30 minutos de horneado, como ya estará dorada por encima, pon papel de aluminio para que no se te queme");
        Instruction instruction4 = new Instruction(4, "Apaga el horno y deja que la tarta de enfríe dentro con la puerta entreabierta durante cuatro o cinco horas. Cúbrela con papel de aluminio y guarda la tarta en la nevera durante toda la noche..");

        List<Instruction> instructions = new ArrayList<>();
        instructions.add(instruction1);
        instructions.add(instruction2);
        instructions.add(instruction3);
        instructions.add(instruction4);

        Category postres = new Category("Reposteria",new ArrayList<>());
        Recipe recipe1 = new Recipe("Tarta de queso", postres, tartaQueso, instructions);
        System.out.println(recipe1);











    }
}