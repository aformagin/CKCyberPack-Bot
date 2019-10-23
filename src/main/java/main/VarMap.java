package main;

import static main.TokenReader.read;

/*
 * This class is used as a variable map, everything important will be declared here
 * and then used elsewhere throughout the code.
 *
 */
public class VarMap {

    //Read token from the token data file instead of using this.
    static String token = read();


    //Outputted Strings
    public static String onlineOutput = "Online";


    //Role IDs
    public static String newb = "New Programmers";
    public static String modPrg = "Moderate Programmers";
    public static String prgWizard = "Programming Wizards";

}
