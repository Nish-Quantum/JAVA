package MethodsInJava;

public class Shadowing {
    static int x=90;                 //this is shadowed at line 8 higher level is shadowed
    public static void main(String[] args){
        System.out.println(x);       //90
       /*
       int x;
       sout(x)   --->error isn't initialised
        */
        int x = 40;                  //local scope
        System.out.println(x);       //40
        fun();
    }
    static void fun(){
        System.out.println(x);       //90
    }

}
