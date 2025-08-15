import java.util.Scanner;
public class Forloop {
    public static void main(String[] args) {
        /*
        print numbers from 1 to 5
         */
        /*
        syntax of for loop
        for(int x(initialisation):condition:updation){
            YOUR CODE HERE BODY
            }
         */
    Scanner input = new Scanner(System.in);
        System.out.println("Enter number ");
        int n=input.nextInt();
        for(int j=1;j<=n;j++){
            System.out.println(j);
        }



}
}
