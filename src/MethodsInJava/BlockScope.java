package MethodsInJava;

public class BlockScope {
    public static void main(String[] args) {
        int a = 99;
        int b = 88;
        {
            a = 7;    // already initialised  outside cannot be initialised again but can be changed ,used,modified
            int c = 56;   //value initialised in this block will remain in this block
        }
        //System.out.println(c); ---> ERROR
        System.out.println(a);
    }

}