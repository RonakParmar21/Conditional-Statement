
/* 
Write a Program to get two numbers from keyboard and print the maximum number among them.
(a) Using if…else (b) Using Multiple if (c) Using Ternary Operator
*/
import java.util.*;

import javax.sound.sampled.SourceDataLine;

public class p_05 {
    public void if_else(int n1, int n2) {
        System.out.println("-------------------------------------------");
        System.out.println("Using if else...");
        if (n1 > n2) {
            System.out.println(n1 + " is max");
        } else {
            System.out.println(n2 + " is max");
        }
    }

    public void multi_if(int n1, int n2) {
        System.out.println("-------------------------------------------");
        System.out.println("Using multiple if...");
        if (n1 > n2) {
            System.out.println(n1 + " is max");
        }
        if (n2 > n1) {
            System.out.println(n2 + " is max");
        }
    }

    public void ternary(int n1, int n2) {
        System.out.println("-------------------------------------------");
        System.out.println("Using ternary...");
        String max;
        max = (n1 > n2) ? "max" : "min";
        System.out.println(max);
    }

    public static void main(String[] args) {
        p_05 p = new p_05();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int n1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int n2 = sc.nextInt();

        p.if_else(n1, n2);
        p.multi_if(n1, n2);
        p.ternary(n1, n2);
    }
}