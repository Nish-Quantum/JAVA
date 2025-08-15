package MethodsInJava;

import java.util.Scanner;

public class Methods {
    public static void main(String args[]){
        sum();
        int ans = Sum();//hereee  initiate the variable using reference variable
        System.out.printf("sum is %d",ans);//returning using methods

    }
    static void sum() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 2 numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = a + b;
        System.out.printf("sum = %d", c);//here function doesnt return a value
    }
    //return a value
    static int Sum() {
        Scanner input = new Scanner(System.in);
            System.out.println("\nenter 2 numbers ");
            int a = input.nextInt();
            int b = input.nextInt();
            int sum = a+b;
            return sum;//function returns a value also return does end the method ,nothing executes after this


    }
}
   /*
           ----> access modifier (in OOPS) return_type(name)
            return_type name(){
            //body
            return;
            }
         */