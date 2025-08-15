package MethodsInJava;
import java.util.Arrays;
public class FunctionOverloading {
    public static void main(String[] args) {
        fun("kunal");
        fun(9,89);
        fun(89);
        fun("kunal","ram","hh");
        fun(2,34,5);
        //decides which function to run at compile time
        //either the number of arguments or type of arguments must vary
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
    static void fun(int a,int b){
        System.out.println(a);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
