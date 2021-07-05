import Zelp.Restaurant ;
import Zelp.Shop;
import Zelp.Theater;
import com.google.common.collect.Sets;

import java.util.HashSet;

public class App{
    public static void main(String[] args) {
        HashSet<String> prices = Sets.newHashSet("30D" , "40D" , "50D");

//        RestaurantInterface test = new Restaurant("shawerma") ;
//        System.out.println("restaurant name is " + test.getName());
//        test.addPriceCategory(prices);
//        test.addReview("Qusay"   ,   4);
//        test.addReview("ahmad"   ,   3);
//        test.addReview("Mahmood" ,   5);
//        System.out.println( "reviews for this restaurant " +  test.getReviews());
//        System.out.println("price category "+test.getPriceCategory());
//        System.out.println(test.getStars() + " stars");
//        System.out.println(test.toString());
        //first Restaurant
        Restaurant mac = new Restaurant("mac");
        HashSet<String> macPrices = Sets.newHashSet("30D" , "40D" , "50D");
        mac.addPriceCategory(macPrices);
        mac.addReview("Qusay" , 5);
        mac.addReview("hadi" , 4);
        mac.addReview("Ali " , 3.445);
        System.out.println(mac.toString());
        //second Restaurant
        Restaurant shawerma = new Restaurant("shawerma") ;
        HashSet<String> shawermaPrices = Sets.newHashSet("5D" , "10D" , "15D");
        shawerma.addPriceCategory(shawermaPrices);
        shawerma.addReview("Qusay" , 1000);
        shawerma.addReview("Jason" , 5);
        shawerma.addReview("Ahmad" , 7);
        System.out.println(shawerma.toString());
        //shop
        Shop carrefour = new Shop("Carrefour" , "exists in Amman" , 5);
        carrefour.addReview("Qusay" , 4);
        System.out.println(carrefour.toString());
        //theater
        Theater primeCinema = new Theater("Prime Cinema" , "Interstellar");
        primeCinema.addMovie("Inception");
        System.out.println(primeCinema.toString());
        primeCinema.addReview("qusay" , 1);
        System.out.println(primeCinema.getReviews());

    }
}