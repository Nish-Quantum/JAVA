import java.util.Scanner;
public class Ifelse{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("PRINT YOUR SALARY");
        int salary = input.nextInt();
        if (salary>6000){
            salary=salary +2000;
        }else{
            salary=salary+1000;
        }
        System.out.println("your salary is "+salary);
    }
}
