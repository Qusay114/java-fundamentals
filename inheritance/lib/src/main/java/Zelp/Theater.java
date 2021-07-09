package Zelp;

import java.util.ArrayList;

public class Theater extends Review{
    private String name ;
    private ArrayList<String> movies = new ArrayList<>();
    public Theater(String name , String movie){
        this.name = name ;
        this.movies.add(movie);
    }

    public void addMovie(String movie){
        this.movies.add(movie);
    }
    public void removeMovie(String movie){
        this.movies.remove(movie);
    }
    @Override
    public String toString(){
        return this.name + " is currently showing " + this.movies.toString() + " movies" ;
    }
}
