import java.util.Scanner;
public class Calculator{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("enter operation that needs to be performed");
        char op = input.next().trim().charAt(0);
        int ans=0;
        if(op=='+'||op=='-'||op=='*'||op=='/'){
            System.out.println("enter a");
            int a= input.nextInt();
            System.out.println("enter b ");
            int b = input.nextInt();
            if(op=='+'){
                ans=a+b;
            }
            if(op=='-'){
                ans=a-b;
            }
            if(op=='*'){
                ans=a*b;
            }
            if(op=='/'){
                ans=a/b;
            }

        }
        else{
            System.out.println("enter valid operating symbol");
        }
        System.out.println("your answer is "+ans);
    }
}
