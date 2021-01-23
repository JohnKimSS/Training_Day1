/**
 * @Author John Kim
 */
package com.ss.basics.dirlist;

import java.util.IOException;
//import java.nio.file.File;
import java.io.File;
//import java.nio.file.Paths;

public class DirList {

    string fulldir1 = "C:\\Users\\johnk\\OneDrive\\Documents\\GitHub\\Practice\\React\\Training_Day1";
    string fulldir2 = "C:/Users/johnk/OneDrive/Documents/GitHub/Practice/React/Training_Day1"
    string fulldir3 = "C:\Users\johnk\OneDrive\Documents\GitHub\Practice\React\Training_Day1";
    string shortdir1 = "../../..";
    public static void main(String[] args) {
        try {File dirPath = new File("C:\\Users\\johnk\\OneDrive\\Documents\\GitHub\\Practice\\React\\Training_Day1");
            // create list called content of everything in the path specified above
            String content[] = dirPath.list();
            // loop through contents of the list 'contents'
            for(int i=0; i<content.length; i++) {
                System.out.println(content[i]);
            }
        } catch(java.io.IOException err) {
            err.printStackTrace();
        }
    }

}