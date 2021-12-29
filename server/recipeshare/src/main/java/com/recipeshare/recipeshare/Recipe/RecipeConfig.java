package com.recipeshare.recipeshare.Recipe;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class RecipeConfig {
    @Bean
    CommandLineRunner clr(RecipeRepository r){
        return args -> {
            List<Recipe> l = new ArrayList<>();
            l.add(new Recipe("Sami","Omellette","Omellete aux poivrons..",25,25,"https://cdn.pixabay.com/photo/2015/05/20/16/11/kitchen-775746_1280.jpg","Cuire oeufs..."));
            l.add(new Recipe("Pierre","Salade","Salades pour maigrir",8,20,"https://cdn.pixabay.com/photo/2016/08/18/18/40/salad-1603608_1280.jpg","Melanger tomates"));
            l.add(new Recipe("Elyas","Frites","Frites pour les gourmands",40,30,"https://cdn.pixabay.com/photo/2020/06/23/14/33/french-fries-5332766_1280.jpg","Couper pommes de terre"));
            l.add(new Recipe("Sarah","Crèpes","Délicieuse crèpes",70,45,"https://cdn.pixabay.com/photo/2018/05/01/18/21/eclair-3366430_1280.jpg","Applatir..;"));
            r.saveAll(l);
        };
    }
}
