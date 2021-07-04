import Restaurant.Restaurant ;
import Restaurant.Review ;
import Restaurant.RestaurantInterface ;
import com.google.common.collect.Sets;

import java.util.HashSet;

public class App{
    public static void main(String[] args) {
        HashSet<String> prices = Sets.newHashSet("30D" , "40D" , "50D");

        Restaurant test = new Restaurant("shawerma") ;
        System.out.println("restaurant name is " + test.getName());
        test.addPriceCategory(prices);
        test.addReview("Qusay"   ,   4);
        test.addReview("ahmad"   ,   3);
        test.addReview("Mahmood" ,   5);
        System.out.println( "reviews for this restaurant " +  test.getReviews());
        System.out.println("price category "+test.getPriceCategory());
        System.out.println(test.getStars() + " stars");
        System.out.println(test.toString());

    }
}