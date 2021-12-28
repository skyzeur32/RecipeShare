package com.recipeshare.recipeshare.Recipe;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class RecipeService {

    public RecipeService() {
    }

    public List<Recipe> getRecipes() {
        List<Recipe> l = new ArrayList<>();
        l.add(new Recipe(1L,"Sami","Omellette","Omellete aux poivrons..",25,25,"https://cdn.pixabay.com/photo/2015/05/20/16/11/kitchen-775746_1280.jpg","Cuire oeufs..."));
        l.add(new Recipe(2L,"Pierre","Salade","Salades pour maigrir",8,20,"https://cdn.pixabay.com/photo/2016/08/18/18/40/salad-1603608_1280.jpg","Melanger tomates"));
        l.add(new Recipe(3L,"Elyas","Frites","Frites pour les gourmands",40,30,"https://cdn.pixabay.com/photo/2020/06/23/14/33/french-fries-5332766_1280.jpg","Couper pommes de terre"));
        l.add(new Recipe(4L,"Sarah","Crèpes","Délicieuse crèpes",70,45,"https://cdn.pixabay.com/photo/2018/05/01/18/21/eclair-3366430_1280.jpg","Applatir..;"));
        return  l;
    }
}
