import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        //test pluralize method
        /**
         int dogCount = 1;
         System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

         int catCount = 2;
         System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

         int turtleCount = 0;
         System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
         */

        //test flipNHeads method
        /**
         flipNHeads(2);
         */

        //test clock method
        /**
         clock();
         */


    }

    /**
     *
     * @param word
     * @param num
     * @return
     */
    public static String pluralize(String word , int num ){
        if(num != 1 ){
            return word+'s'  ;
        }
        else {
            return  word ;
        }
    }

    /**
     *
     * @param n
     */
    public static void flipNHeads(int n){
        int headsNumRow = 0 ;
        int flipsNum = 0 ;
        while(headsNumRow<n){
            flipsNum++;
            if(Math.random() < 0.5){
                System.out.println("tails");
                headsNumRow = 0;
            }
            else{
                System.out.println("heads");
                headsNumRow ++ ;
            }
        }
        String wordFlip = " flips" ;
        String wordHead = " heads";
        if(flipsNum<=1) {
            wordFlip = " flip";
            wordHead = " head";
        }
        System.out.println("It took " + flipsNum + wordFlip + " to flip " + n + wordHead + " in a row.");
    }

    public static void clock(){
        int currentSec = 0 ;
        for(int i = 0 ; i>=0 ; i++) {
            LocalDateTime now = LocalDateTime.now();
            int second = now.getSecond();
            if(currentSec != second){
                currentSec = second ;
                String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                System.out.println(time);
            }
        }
    }

}
