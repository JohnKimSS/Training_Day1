package ss.basics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
//import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextAppendJK {
    
    public static void main(String[] args) {
        //StringBuffer sb = new StringBuffer();
        //string localDir = "C:\\Users\\johnk\\OneDrive\\Documents\\GitHub\\Practice\\React\\Training_Day1\\03TextAppend\\src\\ss\\basics\\b-script.txt";

        try {
            // note re-write path with util
            FileWriter fw = new FileWriter("C:\\Users\\johnk\\OneDrive\\Documents\\GitHub\\Practice\\React\\Training_Day1\\03TextAppend\\src\\ss\\basics\\b-script.txt", true);
            fw.write("\nMorty look, Morty I turned myself into a pickle. I'M PICKLE RICK!!!!\n");
            fw.close();
            System.out.println("line written to file");
        } catch(IOException err) {
            System.err.print(err);
        }
    }

}
