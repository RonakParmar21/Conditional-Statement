/* 
Write a program, which reads two integer values. If the first is less than the second, print the message UP. If second is less than first, print the message DOWN If the numbers are equal, print the message EQUAL.
(a) Using if…else if…else (b) Using Multiple if
*/
import java.util.*;
public class p_06 {
    public void if_else(int n1, int n2) {
        System.out.println("-------------------------------------------");
        System.out.println("Using if else...");
        if(n1 < n2) {
            System.out.println("UP");
        } else if(n2 < n1) {
            System.out.println("DOWN");    
        } else {
            System.out.println("EQUAL");
        }
    }
    public void multi_if(int n1, int n2) {
        System.out.println("-------------------------------------------");
        System.out.println("Using multiple if...");
        if(n1 < n2) {
            System.out.println("UP");
        }
        if(n2 < n1) {
            System.out.println("DOWN");
        }
        if(n1 == n2) {
            System.out.println("EQUAL");
        }
    }
    public static void main(String[] args) {
        p_06 p = new p_06();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int n1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int n2 = sc.nextInt();

        p.if_else(n1, n2);
        p.multi_if(n1, n2);
    }
}
