package com.company;
class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String plot(){
        return"No plot here!...";
    }
}
class jows extends Movie{
    public jows() {
        super("Jows");
    }
    public String plot(){
        return "Shark eats lots of people";
    }
}
class independeceDay extends  Movie{
    public independeceDay() {
        super("Independence Day");
    }

    public String plot() {
        return ("Alience Attempted To Take Over Planet.......");

    }
}

class mazeRunner extends Movie{
    public mazeRunner() {
        super("Maze Runner");
    }

    public String plot() {
        return"Kids Try and Escape The Maze";
    }
}

class Starwares extends  Movie{
    public Starwares() {
        super("Star Wars");
    }

    
    public String plot() {
        return "The Wars Bitween Stars And in Other Planet...";
    }
}
class Forgetable extends  Movie{
    public Forgetable() {
        super("ForgetAble");

    }
    //without plot
}







public class Main {

    public static void main(String[] args) {
	for(int i=1;i<11;i++){
	    Movie movie=RandomMovie();
        System.out.println("Movie #"+i+" "+movie.getName()+"\n"+"Plot is : "+movie.plot()+"\n");
    }
    }

    public static Movie RandomMovie(){
        int randomNomber =(int) (Math.random()*5)+1;
        System.out.println("Random number genetared was : "+ randomNomber);
        switch (randomNomber){
            case 1:
                return new jows();
            case 2:
                return new independeceDay();
            case 3:
                return new mazeRunner();
            case 4:
                return new Starwares();
            case 5:
                return new Forgetable();
        }
        return null;

    }

}
