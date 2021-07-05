package Zelp;

import java.util.HashMap;
import java.util.HashSet;

public interface RestaurantInterface {
//     void addRestaurantName (String name);
     void addPriceCategory (HashSet priceCategory) ;
     void addReview(String author , int stars);
     HashMap getReviews();
     String getName() ;
     HashSet getPriceCategory();
     double getStars();
     String toString();
}
