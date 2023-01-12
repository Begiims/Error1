import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException{


        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int counter = 0;
        for (int j = 0; j < 100; j++) {
            if (j + j == i) {
                counter++;
            }

        }
        if (counter == 0) {
            throw new Error();

        } else
            System.out.println("No problem");
        System.out.println("You can continue");

       /**  Scanner scanner = new Scanner(System.in);
         int io = sc.nextInt();
         double  a = 9;
         double b = 4;
         double c = 16;
         double d = Math.sqrt(a);
         double d1= Math.sqrt(b);
         double  d2 = Math.sqrt(c);
         System.out.println("d = "+d);
         System.out.println("d1 = "+d1);
         System.out.println("d2 = "+ d2);




        System.out.println(Math.sqrt(a));

        a = 4;

        System.out.println(Math.sqrt(a));

        a = 16;

        System.out.println(Math.sqrt(a));**/





    }
}







