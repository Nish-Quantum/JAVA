package MethodsInJava;

import java.util.Scanner;

public class swap {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("enter a");
        int a = input.nextInt();
        System.out.println("enter b");
        int b = input.nextInt();
       // int temp = a;
      //  a=b;
      //  b = temp;
       // System.out.println(a + " " +b);

        //in function
        Swap(a,b);
        System.out.println(a + " " + b);


    }
    static void Swap(int a,int b){
        int temp = a;
        a=b;
        b=temp;
    // this works cause we are modifying
    }
}
// java has only pass by value , no pass by reference