package HackerRank;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UsernameValidator {
   /* You are updating the username policy on your company's internal networking platform.
   According to the policy, a username is considered valid if all the following constraints are satisfied:

    The username consists of 8 to 30 characters inclusive.
    If the username consists of less than 8 or greater than 30 characters,
     then it is an invalid username.
    The username can only contain alphanumeric characters and underscores (_).
     Alphanumeric characters describe the character set consisting of lowercase characters ,
     uppercase characters , and digits .
    The first character of the username must be an alphabetic character,
    i.e., either lowercase character  or uppercase character .*/
    public static boolean NumberOfCharacters(String text){
        boolean booleanResult= false;
        if (text.length()<30 && text.length()>8){
            booleanResult= true;
        }
        return booleanResult;
    }
    public static boolean alphanumeric(Object text){
    return text instanceof String;
    }
    public  static boolean alphanumeric(Integer value){
        return value instanceof Integer;
    }

    public static boolean symbols(String text){
        return Pattern.matches("^[.*/]*",text);
    }
    public static boolean startsWithInteger(String text){
        return Pattern.matches("^\\d+.*",text);
    }
    public static void main (String[] args){
        System.out.print("Please input a name:");
       Scanner input = new Scanner(System.in);
       String name = input.next().trim();

       if(startsWithInteger(name)){
           System.out.println("Username cannot start with a number");
       }
        System.out.println(symbols("sih*./"));

    }

}

