import java.util.Scanner;
public class FirstJava{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter temperature in fahrenheit");
        double temp = input.nextDouble();
        double c = 9/5 *(temp-32);
        System.out.printf("temperature in fahrenheit of %f degree fahrenheit to celcius is %f\n",temp,c);
        System.out.println("ನಮಸ್ತೆ");



    }
}
