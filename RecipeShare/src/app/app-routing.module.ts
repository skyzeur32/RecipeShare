import { NgModule } from "@angular/core";
import {RouterModule, Routes} from '@angular/router';
import { RecipeListComponent } from "./recipe-list/recipe-list.component";
import { RecipeComponent } from "./recipe/recipe.component";
import { SingleRecipeComponent } from "./single-recipe/single-recipe.component";

const routes: Routes = [
    {path : 'recettes',component:RecipeListComponent},
    {path:'recette/:id', component:SingleRecipeComponent}
];
@NgModule({
    imports:[
        RouterModule.forRoot(routes)
    ],
    exports : [
        RouterModule
    ]
})
export class AppRoutingModule{

}
