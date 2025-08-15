package MethodsInJava;
import java.util.Arrays;
public class VarArgs {
    public static void main(String[] args) {
        fun(4,6,7,99,78);
        multiple(3,4,"man","ggg");
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
        //when we don't know how mny arguments we need to take
        //creates an array
    }
    static void multiple(int a, int b,String ...v){
        //when we need multiple types of arguments
        //ordering is imp 1-->int 2--->int 3--->string .......
    }
}
