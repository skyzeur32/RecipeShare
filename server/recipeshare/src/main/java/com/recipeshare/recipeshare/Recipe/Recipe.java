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
    private Integer like;
    private Integer time;
    private String img;
    public Recipe() {
    }

    public Recipe(Long id,String auteur, String title, String description, Integer like, Integer time, String img, String instructions) {
        this.auteur = auteur;
        this.title = title;
        this.description = description;
        this.like = like;
        this.time = time;
        this.img = img;
        this.instructions = instructions;
        this.id=id;
    }
    public Recipe(String auteur, String title, String description, Integer like, Integer time, String img, String instructions) {
        this.auteur = auteur;
        this.title = title;
        this.description = description;
        this.like = like;
        this.time = time;
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

    private String instructions;



    public String getAutor() {
        return auteur;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Integer getLike() {
        return like;
    }

    public Integer getTime() {
        return time;
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

    public void setLike(Integer like) {
        this.like = like;
    }

    public void setTime(Integer time) {
        this.time = time;
    }
}
