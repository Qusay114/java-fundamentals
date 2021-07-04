package Restaurant;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Restaurant  implements RestaurantInterface {
    private String name ;
    private HashMap<String , Integer> reviews = new HashMap<String , Integer>();
    private double stars ;
    private HashSet priceCategory = new HashSet<>()  ;
    public Restaurant(String name){
        this.name = name ;
    }

    public void addPriceCategory(HashSet priceCategory) {
        this.priceCategory.addAll(priceCategory) ;
    }

    public void addReview(String author, int stars) {
        this.reviews.put(author , stars) ;
        updateReview();
    }

    public HashMap getReviews() {
        return this.reviews ;
    }
    public String getName(){
        return this.name ;
    }
    public HashSet getPriceCategory(){
        return this.priceCategory ;
    }

    private void updateReview(){
        int sum = 0;
        for(Integer stars : reviews.values())
            sum+=stars ;
        this.stars = (double) sum / reviews.size() ;
    }
    public double getStars(){
        return this.stars ;
    }
    public String toString(){
        return this.name + " resturant has " +this.stars + " stars review and price category " + this.priceCategory ;
    }

}
