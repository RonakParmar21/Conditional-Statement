
/*
Write a Program to accept any number and check whether it is positive or negative
(a) Using if…else (b) Using Multiple if (c) Using Ternary Operator
*/
import java.util.*;

public class p_02 {
    public void if_else(int n) {
        System.out.println("-------------------------------------------");
        System.out.println("Using if else...");

        if (n >= 0) {
            System.out.println(n + " is positive");
        } else {
            System.out.println(n + " is negative");
        }
    }

    public void multi_if(int n) {
        System.out.println("-------------------------------------------");
        System.out.println("Using multiple if...");

        if (n >= 0) {
            System.out.println(n + " is positive");
        }
        if (n < 0) {
            System.out.println(n + " is negative");
        }
    }

    public void ternary(int n) {
        System.out.println("-------------------------------------------");
        System.out.println("Using ternary...");

        String pos;
        pos = (n >= 0) ? "positive" : "negative";

        System.out.println(n + " is " + pos);
    }

    public static void main(String[] args) {
        p_02 p = new p_02();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number : ");
        int n = sc.nextInt();
        p.if_else(n);
        p.multi_if(n);
        p.ternary(n);
    }
}