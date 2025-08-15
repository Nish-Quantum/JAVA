import java.util.Scanner;
public class Whileloop{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter num");
        int num = input.nextInt();
        int n=1;
        while(n<=num){
            System.out.println(n);
            n++;

        }
        /*
        do while loop ------>loop executes atleast once;)
        syntax
                   do{
                      }while(condition);
         */
        System.out.println("enter m");
        int m=input.nextInt();

        do{
            System.out.println("hello");
        }
        while(m!=9);



    }
}