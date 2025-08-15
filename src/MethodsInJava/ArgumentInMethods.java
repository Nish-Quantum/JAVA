package MethodsInJava;

import java.util.Scanner;

public class ArgumentInMethods {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int answer = sum(334,990);
        System.out.printf("your answer is %d\n",answer);
        System.out.println("Enter your name");
        String name = input.next();


        String GreetMessage = greet(name);//else seeda nishchitha
        System.out.println(GreetMessage);

    }




    static int sum(int a ,int b ){
        int sum = a+b;
        return sum;
    }




    static String greet(String name){
        String Greeting = "Hello "+name;
        return Greeting;
    }
}
    //no need to create input scanner in each method

