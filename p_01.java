
/* 
Write a Program to accept any number and check whether it is divisible by 9 or not.
*/
import java.util.*;

public class p_01 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any Number : ");
        int n = sc.nextInt();

        if (n % 9 == 0) {
            System.out.println(n + " is divisible by 9");
        }
    }
}