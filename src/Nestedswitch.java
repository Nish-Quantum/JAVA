import java.sql.SQLOutput;
import java.util.Scanner;
public class Nestedswitch {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("enter emp id");
        int EmpId= input.nextInt();
        System.out.println("Emp Dep");
        String EmpDep= input.next();
        switch(EmpId){
            case 1:
                System.out.println("kunal");
                break;
            case 2:
                System.out.println("nishchitha");
                break;
            case 3:{
                switch(EmpDep){
                    case "IT" -> System.out.println("IT");
                    case "Managemenet" -> System.out.println("Management");
                    default -> System.out.println("enter vaild dep");
                }
            }
        }


    }







}




