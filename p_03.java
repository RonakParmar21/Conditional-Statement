
/* 
Write a program to read any number and determine whether a number is “ODD” or “EVEN” and print the message NUMBER IS ODD or NUMBER IS EVEN.
(a) Using if…else (b) Using Multiple if (c) Using Ternary Operator
*/
import java.util.*;

public class p_03 {
    public void if_else(int n) {
        System.out.println("-------------------------------------------");
        System.out.println("Using if else...");

        if (n % 2 == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
    }

    public void multi_if(int n) {
        System.out.println("-------------------------------------------");
        System.out.println("Using multiple if...");
        if (n % 2 == 0) {
            System.out.println(n + " is even");
        }
        if (n % 2 != 0) {
            System.out.println(n + " is odd");
        }
    }

    public void ternary(int n) {
        System.out.println("-------------------------------------------");
        System.out.println("Using ternary...");
        String str;
        str = (n % 2 == 0) ? "even" : "odd";
        System.out.println(n + " is " + str);
    }

    public static void main(String[] args) {
        p_03 p = new p_03();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number : ");
        int n = sc.nextInt();

        p.if_else(n);
        p.multi_if(n);
        p.ternary(n);
    }
}