import java.util.Scanner;

public class Switch {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String a ="nishu";
        String b="nishu";
        System.out.println(a==b);
        /*
            ----->  (a==b) checks if both are same objects have same reference
              it might be true or false
              ----->But .equals just checks value and not refrence
               it is true if both are same
               if(fruit.equals("mango")){
               sout("kin of fruits")
               }
         */
        String fruit = input.next();
        switch(fruit) {
            case "mango":
                System.out.println("king of fruits");
                break;
            case "apple":
                System.out.println("a sweet red fruit");
                break;
            case "orange":
                System.out.println("a citrus fruit");
                break;
            default:
                System.out.println("please enter a valid fruit");
        }
        int day=input.nextInt();
        switch(day){
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");

        }

    }
}
