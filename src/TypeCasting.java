import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = (int)(345.889f);
        System.out.println(num);
      //  int a=257;
        //byte b = (byte)(a);
        //System.out.println(b);
        byte a=40;
        byte b=50;
        byte c=100;
        int d=a*b/c;
        System.out.println(d);
        //error if byte d=a*b/c;
        int mm='a';
        System.out.println(mm);//prints ASCII value
        

        

    }
}
