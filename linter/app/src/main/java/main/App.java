package main.java.main;

import java.io.*;
import java.util.Scanner;

public class App {


    public static void main(String[] args) throws IOException {


        fixMissingSemiColons("./linter/app/src/main/resources/gates.js");

    }


    public static void fixMissingSemiColons(String filePath) throws IOException {
        File file = new File(filePath);
        Scanner readFile = new Scanner(file);
        File outputFile = new File("./linter/app/src/main/resources/output.js");
        outputFile.createNewFile();
        FileWriter writer = new FileWriter(outputFile);
        int lineCounter = 0 ;
        while (readFile.hasNextLine()){
            lineCounter ++ ;
            String data = readFile.nextLine();
            writer.write(data);
            if(data.length() == 0) {
                writer.write("\n");
                continue;
            }
            if(data.charAt(data.length()-1)!=';'){
                if(data.charAt(data.length()-1) != '{' && data.charAt(data.length()-1) !='}'
                        && data.contains("if")==false && data.contains("else")==false) {
                    System.out.println("Line " + lineCounter + ": Missing semicolon.");
                    writer.write(';');
                }
            }
            writer.write("\n");

        }
        writer.close();

        readFile.close();
    }
}