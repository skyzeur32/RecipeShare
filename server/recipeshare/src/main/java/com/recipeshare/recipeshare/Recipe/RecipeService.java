package com.recipeshare.recipeshare.Recipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class RecipeService {
    private final RecipeRepository rr;
    @Autowired
    public RecipeService(RecipeRepository rr) {
        this.rr = rr;
    }

    public List<Recipe> getRecipes() {


        return  rr.findAll();
    }

    public void addNewRecipe(Recipe r) {
        System.out.println(r);
    }
}
