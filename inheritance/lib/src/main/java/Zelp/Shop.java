package Zelp;

public class Shop extends Review{
    private String name ;
    private String description ;
    private int num$  ;
    public Shop(String name , String description , int numDollarSigns){
        this.name = name ;
        this.description = description ;
        this.num$ = numDollarSigns ;
    }

    public String getName(){
        return this.name ;
    }

    public String getDescription(){
        return this.description ;
    }
    public String getNumDollarSigns(){
        String signsCollection="" ;
        while(this.num$-- > 0)
            signsCollection+="$";
        return signsCollection ;
    }
@Override
    public String toString(){
        return this.name + " shop is " + this.description + " , and has " + getNumDollarSigns()+" , " +super.getStars()+ " stars review" ;
    }
}
