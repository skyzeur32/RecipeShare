import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Recipe } from '../Models/recipe.model';
import { RecipeService } from '../service/recipe.service';

@Component({
  selector: 'app-recipe-list',
  templateUrl: './recipe-list.component.html',
  styleUrls: ['./recipe-list.component.scss']
})
export class RecipeListComponent implements OnInit {
  recipes!:Recipe[];
  constructor(private recipeService : RecipeService) { }

  ngOnInit(): void {
    this.getRecipes();
  }

  public getRecipes() :void{
    this.recipeService.getAllRecipe().subscribe(
      (response : Recipe[]) =>{
        this.recipes = response;
      },
      (error:HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }

}
