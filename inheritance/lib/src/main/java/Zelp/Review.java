package Zelp;

import java.util.HashMap;

public class Review {
    private String author ;
    private double stars ;
    private HashMap<String , Double> reviews = new HashMap<String , Double>();

    public void addReview(String author , double stars){
        this.reviews.put(author , stars) ;
        updateReview();
    }
    private void updateReview(){
        double sum = 0;
        for(Double stars : reviews.values())
            sum+=stars ;
        this.stars = sum / reviews.size() ;
    }

    public float getStars() {
        return (float)stars;
    }

    public String getReviews() {
        return this.reviews.toString();
    }

    public String toString(){
        return "Author Name is " + this.author + " and his review is " + this.stars ;
    }
}
