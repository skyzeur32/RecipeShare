import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Recipe } from '../Models/recipe.model';
import { RecipeService } from '../service/recipe.service';

@Component({
  selector: 'app-single-recipe',
  templateUrl: './single-recipe.component.html',
  styleUrls: ['./single-recipe.component.scss']
})
export class SingleRecipeComponent implements OnInit {
  recipe!:Recipe;
  constructor(private rs:RecipeService,private route : ActivatedRoute) { }

  ngOnInit(): void {
    const recipeid = this.route.snapshot.params['id'];
    this.rs.getAllRecipe().subscribe(
      (response : Recipe[]) =>{
        
          this.recipe = response.find(r => r.id == recipeid)!;
        
      },
      (error:HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }

}
