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
        String line = "token";
        try {
            reader = new BufferedReader(new FileReader(
                    "src/main/resources/token.txt"));//This is hardcoded for now
            line = reader.readLine();
            System.out.println(line);//Prints token to the console so admin can check
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return line;
    }

}
