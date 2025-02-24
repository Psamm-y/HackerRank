package HackerRank;

import java.util.Scanner;

public class UsernameValidator {
   /* You are updating the username policy on your company's internal networking platform.
   According to the policy, a username is considered valid if all the following constraints are satisfied:

    The username consists of 8 to 30 characters inclusive. If the username consists of less than 8 or greater than 30 characters,
     then it is an invalid username.
    The username can only contain alphanumeric characters and underscores (_).
     Alphanumeric characters describe the character set consisting of lowercase characters ,
     uppercase characters , and digits .
    The first character of the username must be an alphabetic character,
    i.e., either lowercase character  or uppercase character .*/
    public boolean characters(String text){
        boolean booleanResult= false;
        if (text.length()<30 && text.length()>8){
            booleanResult= true;
        }
        return booleanResult;
    }
    public boolean alphanumeric(Object text){
    return text instanceof String;
    }
    public boolean alphanumeric(Integer value){
        return value instanceof Integer;
    }
    public static void main (String[] args){
        UsernameValidator uv = new UsernameValidator();
        System.out.println(uv.alphanumeric("Samuel"));
        System.out.println(uv.alphanumeric(23));

    }
}
