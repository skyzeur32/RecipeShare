package com.recipeshare.recipeshare.Recipe;

import javax.persistence.*;

@Entity
@Table
public class Recipe {
    @Id
    @SequenceGenerator(
            name="recipe_sequence",
            sequenceName = "recipe_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "recipe_sequence"
    )
    private Long id;
    private String auteur;
    private String title;
    private String description;
    private Integer likes;

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Integer getDuree() {
        return duree;
    }

    public void setDuree(Integer duree) {
        this.duree = duree;
    }

    private Integer duree;
    private String img;
    private String instructions;


    public Recipe() {
    }

    public Recipe(Long id,String auteur, String title, String description, Integer likes, Integer duree, String img, String instructions) {
        this.auteur = auteur;
        this.title = title;
        this.description = description;
        this.likes = likes;
        this.duree = duree;
        this.img = img;
        this.instructions = instructions;
        this.id=id;
    }
    public Recipe(String auteur, String title, String description, Integer likes, Integer duree, String img, String instructions) {
        this.auteur = auteur;
        this.title = title;
        this.description = description;
        this.likes = likes;
        this.duree = duree;
        this.img = img;
        this.instructions = instructions;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }





    public String getAutor() {
        return auteur;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }



    public void setAutor(String auteur) {
        this.auteur = auteur;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
