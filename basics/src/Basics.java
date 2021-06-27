import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Basics {
    public static void main(String[] args) {
        int dogCount = 0 ;
        String word = "dog";
//        System.out.println("I own " + dogCount + " " + pluralize(word, dogCount) + ".");
//        flipNHeads(6);
        clock();
    }

    public static String pluralize(String word , int num ){
        if(num != 1 ){
           return word+'s'  ;
        }
        else {
            return  word ;
        }
    }

    public static void flipNHeads(int n){
        int headsNum = 0 ;
        int headsMax = 0 ;
        for(int i = 0 ; i < n ; i++){
            if(Math.random() < 0.5){
                System.out.println("tails");
                   headsNum = 0;
            }
            else{
                System.out.println("heads");
                headsNum ++ ;
                if(headsNum > headsMax) {
                    headsMax = headsNum;
                }
            }
        }
        System.out.println("It took " + n + " flips to flip " + headsMax +" heads in a row.");
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
