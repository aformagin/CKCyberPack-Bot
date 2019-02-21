package main;

/*
 * This class is used as a variable map, everything important will be declared here
 * and then used elsewhere throughout the code. This will also not be add to the
 * GIT Repo due to some of the security vulnerabilities when using AUTH Tokens
 *
 */
public class VarMap {

    //Read token from the token data file instead of using this.
    static String token = "";

    //Outputted Strings
    public static String onlineOutput = "Online";


    //Role IDs
    public static String newb = "New Programmers";
    public static String modPrg = "Moderate Programmers";
    public static String prgWizard = "Programming Wizard";

    /*
     * Actually have no clue if the below section will actually be needed for anything,
     * but I think we can keep it here for now.
     */

    //Rank Values
    public static int progWizard = 4;
    public static int progMod = 3;
    public static int progNewb = 2;
    public static int alum = 1;
}
