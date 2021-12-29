import { Injectable } from "@angular/core";
import { Recipe } from "../Models/recipe.model";
import {HttpClient, HttpErrorResponse} from "@angular/common/http";
import { Observable } from "rxjs";

@Injectable({
    providedIn:'root'
})
export class RecipeService {

    private apiServerUrl = "http://localhost:8080/api/v1/recipe";
    public listRecettes!:Recipe[];
    constructor(private http: HttpClient){

    }
    getRecipeById(recette_id:number) : Recipe {
        this.getAllRecipe().subscribe(
            (response : Recipe[]) =>{
              this.listRecettes = response;
              console.log(this.listRecettes);
              const test = this.listRecettes.length;
              
            },
            (error:HttpErrorResponse) => {
              alert(error.message);
            }
          );
       
       
          return new Recipe(0,"Recettes Inconny","Inconnu","Inconny",0,0,"Inconnu","e");
 
    }
    getAllRecipe() : Observable<Recipe[]>{
        
        return this.http.get<Recipe[]>(this.apiServerUrl);
    }

    likeAndDislike(recipe_id:number,action : "like" | "dislike") : void{
      if(action === "like"){
        this.getAllRecipe().subscribe(
          (response : Recipe[]) =>{
            
              response.find(r => r.id == recipe_id)!.likes++;
            
          },
          (error:HttpErrorResponse) => {
            alert(error.message);
          }
        );
      }
      else{
        this.getAllRecipe().subscribe(
          (response : Recipe[]) =>{
            
              response.find(r => r.id == recipe_id)!.likes--;
            
          },
          (error:HttpErrorResponse) => {
            alert(error.message);
          }
        );
      }
    }
    
}