
/* 
Write a Program to get any number from the console and check whether it is positive, negative or zero.
(a) Using Multiple if (b) Using if…else if…else if…else
*/
import java.util.*;

public class p_07 {
    public void multi_if(int n) {
        System.out.println("-------------------------------------------");
        System.out.println("Using multiple if...");

        if (n > 0) {
            System.out.println(n + " is positive");
        }
        if (n < 0) {
            System.out.println(n + " is negative");
        }
        if (n == 0) {
            System.out.println(n + " is zero");
        }
    }

    public void if_else_if_else(int n) {
        System.out.println("-------------------------------------------");
        System.out.println("Using if else if else...");

        if (n > 0) {
            System.out.println(n + " is positive");
        } else if (n < 0) {
            System.out.println(n + " is negative");
        } else {
            System.out.println(n + " is zero");
        }
    }

    public static void main(String[] args) {
        p_07 p = new p_07();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number : ");
        int n = sc.nextInt();

        p.multi_if(n);
        p.if_else_if_else(n);
    }
}