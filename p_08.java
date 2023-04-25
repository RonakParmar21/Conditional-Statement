/* 
Write a program that will read three numeric values from the user and find out and display the larger one.
(a) Using Multiple if (b) Using Nested if (c) Using if…else if…else
*/
import java.util.*;
public class p_08 {
    public void multi_if(int n1, int n2, int n3) {
        if(n1 > n2 && n1 > n3) {
            System.out.println(n1 +" is large");
        } if(n2 > n1 && n2 > n3) {
            System.out.println(n2 +" is large");
        } if(n3 > n1 && n3 > n2) {
            System.out.println(n3 +" is large");
        }
    }
    public void nested_if(int n1, int n2, int n3) {
        if(n1 > n2) {
            if(n1 > n3) {
                System.out.println(n1 +" is large");
            }
        } if(n2 > n3) {
            if(n2 > n1) {
                System.out.println(n2 +" is large");
            }
        } if(n3 > n1) {
            if(n3 > n2) {
                System.out.println(n3 +" is large");
            }
        }
    }
    public void if_else_if_else(int n1, int n2, int n3) {
        if(n1 > n2) {
            if(n1 > n3) {
                System.out.println(n1 +" is large");
            } else {
                System.out.println(n3 +" is large");
            }
        } else {
            if(n2 > n3) {
                System.out.println(n2 +" is large");
            } else {
                System.out.println(n3 +" is large");
            }
        }
    }
    public static void main(String[] args) {
        p_08 p = new p_08();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int n1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int n2 = sc.nextInt();
        System.out.println("Enter third number : ");
        int n3 = sc.nextInt();

        p.multi_if(n1, n2, n3);
        p.nested_if(n1, n2, n3);
        p.if_else_if_else(n1, n2, n3);
    }
}