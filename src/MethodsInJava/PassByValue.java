package MethodsInJava;

import java.util.Arrays;

public class PassByValue {
    public static void main(String args[]){
        String name = "kunal";
        Change(name);
        System.out.println(name);
        //cant use naam cause naam is available only inside method
        //SCOPING ----> cannot access variables outside methods
        int[] arr={1,2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));


    }



    static void Change(String naam){
        naam = "Rahul";
    }//not changing creating a new object

    static void change(int[] nums){
        nums[0]=99;
    }//works cause we modify the refrence variables

}
