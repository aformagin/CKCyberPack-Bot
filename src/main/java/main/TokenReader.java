/*
 * Uses the BufferedReader to read from local file input.
 */

package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TokenReader {


    public static String read() {
        BufferedReader reader;
        String line = null;//Set it to null, just so it doesn't throw an error bout being not declared
        try {

            //Sets up the file to be read from
            reader = new BufferedReader(new FileReader(
                    "src/main/resources/token.txt"));//This is hardcoded for now
            //Reads the first line of the file
            line = reader.readLine();
            System.out.println(line);//Prints token to the console so admin can check
            reader.close();//Closes the file reader

        } catch (IOException e) {
            e.printStackTrace();
        }

        return line;
    }

}
