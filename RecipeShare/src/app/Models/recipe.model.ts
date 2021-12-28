

export class Recipe{
    id!:number;
    autor!:string;
    title!:string;
    description!:string;
    instructions!:string;
    like!:number;
    time!:number;
    img!:string;

    constructor(id:number,autor:string,titre:string,description:string,like:number,time:number,img:string,instructions:string){
        this.autor = autor;
        this.id = id;
        this.title = titre;
        this.description = description;
        this.like = like;
        this.time = time;
        this.img = img;
        this.instructions = instructions;
    }
}