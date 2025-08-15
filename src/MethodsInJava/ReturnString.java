package MethodsInJava;

import java.util.Scanner;

public class ReturnString {
    public static void main(String args[]){
        String message = greet();
        System.out.println(message);
    }
    static String greet(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter greeeting");
        String greet = input.next();
        return greet;
        //if nothing returned it gives error
        //if return greet();
        //then it function runs infinite times
    }
}
