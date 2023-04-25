
/* 
Write a Program to accept any year in four digits and check whether it is Leap Year or not.
(a) Using if…else (b) Using Multiple if (c) Using Ternary Operator
*/
import java.util.*;

public class p_04 {
    public void if_else(int n) {
        System.out.println("-------------------------------------------");
        System.out.println("Using if else...");

        if (n % 4 == 0) {
            System.out.println(n + " is leap year");
        } else {
            System.out.println(n + " is not leap year");
        }
    }

    public void multi_if(int n) {
        System.out.println("-------------------------------------------");
        System.out.println("Using multiple if...");

        if (n % 4 == 0) {
            System.out.println(n + " is leap year");
        }
        if (n % 4 != 0) {
            System.out.println(n + " is not leap year");
        }
    }

    public void ternary(int n) {
        System.out.println("-------------------------------------------");
        System.out.println("Using ternary...");
        String leap;
        leap = (n % 4 == 0) ? "leap year" : "not leap year";
        System.out.println(n + " is " + leap);
    }

    public static void main(String[] args) {
        p_04 p = new p_04();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number : ");
        int n = sc.nextInt();

        p.if_else(n);
        p.multi_if(n);
        p.ternary(n);
    }
}
