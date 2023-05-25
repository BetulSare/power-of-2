
package power.of.pkg2;

import java.util.Scanner;

public class PowerOf2 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("enter a number: ");
        int number=scan.nextInt();
        int counter=0;
        for (int i = 1; i <=number; i*=2) {
            System.out.println(i);
        }

    }
    
}
