package com.recipeshare.recipeshare.Recipe;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/recipe")
public class RecipeController {

    private final RecipeService rs;

    public RecipeController(RecipeService rs) {
        this.rs = rs;
    }

    @GetMapping
    public List<Recipe> getRecipes(){
        return rs.getRecipes();
    }
    @PostMapping
    public void registerNewRecipe(@RequestBody Recipe r){
        rs.addNewRecipe(r);
    }
}
