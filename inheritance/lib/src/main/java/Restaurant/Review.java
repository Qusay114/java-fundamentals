package Restaurant;

public class Review {
    private String author ;
    private int stars ;
    public Review(String author , int stars){
        this.author = author ;
        this.stars = stars ;
    }

    public String getAuthor(){
        return this.author ;
    }

    public int getStars(){
        return this.stars ;
    }

    public void addReview(String author , int stars){
        this.author = author ;
        this.stars = stars ;
    }

    public String toString(){
        return "Author Name is " + this.author + " and his review is " + this.stars ;
    }
}
