package Zelp;

import java.util.HashSet;

public class Restaurant extends Review {
    private String name ;
    private HashSet priceCategory = new HashSet<>()  ;
    public Restaurant(String name){
        this.name = name ;
    }

    public void addPriceCategory(HashSet priceCategory) {
        this.priceCategory.addAll(priceCategory) ;
    }

    public String getName(){
        return this.name ;
    }
    public HashSet getPriceCategory(){
        return this.priceCategory ;
    }

    @Override
    public String toString(){
        return this.name + " resturant has " +super.getStars()+ " stars review and price category " + this.priceCategory ;
    }

}
