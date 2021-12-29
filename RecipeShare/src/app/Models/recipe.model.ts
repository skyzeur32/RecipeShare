

export class Recipe{
    id!:number;
    autor!:string;
    title!:string;
    description!:string;
    instructions!:string;
    likes!:number;
    duree!:number;
    img!:string;

    constructor(id:number,autor:string,titre:string,description:string,like:number,time:number,img:string,instructions:string){
        this.autor = autor;
        this.id = id;
        this.title = titre;
        this.description = description;
        this.likes = like;
        this.duree = time;
        this.img = img;
        this.instructions = instructions;
    }
}