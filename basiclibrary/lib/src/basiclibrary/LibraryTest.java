package basiclibrary;//package test.java.basiclibrary;
import basiclibrary.Library;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LibraryTest {


    @Test
    public void analyzeWeathDataTest(){
        Library libraryObj = new Library() ;
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
                    };
        String rightResult = "Low Temperature 51\n" +
                "High Temperature 72\n" +
                "Never saw temperature: 63\n" +
                "Never saw temperature: 67\n" +
                "Never saw temperature: 68\n" +
                "Never saw temperature: 69";
        assertTrue("it doesn't return the right string" ,
                libraryObj.analyzeWeathData(weeklyMonthTemperatures).equals(rightResult));

    }
    @Test
    public void tallyTest(){
        Library libraryObj = new Library() ;
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
//        System.out.println(this.libraryObj.tally(votes));
        assertTrue( "the winner should be bush", libraryObj.tally(votes).equals("Bush"));
    }
}
