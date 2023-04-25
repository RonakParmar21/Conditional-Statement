
/* 
Write a program to accept any day number between 1 to 7 and print the message as Monday if day number is 1, Tuesday if day number is 2, Wednesday if day number is 3 and so on. Also display appropriate message if the day number is less than 1 or greater than 7.
(a) Using Multiple if (b) Using if…else if…else (c) Using switch
*/
import java.util.*;

public class p_09 {
    public void multi_if(int day) {
        if (day == 1) {
            System.out.println(day + "is Monday");
        }
        if (day == 2) {
            System.out.println(day + "is Tuesday");
        }
        if (day == 3) {
            System.out.println(day + "is Wednesday");
        }
        if (day == 4) {
            System.out.println(day + "is Thursday");
        }
        if (day == 5) {
            System.out.println(day + "is Friday");
        }
        if (day == 6) {
            System.out.println(day + "is Saturday");
        }
        if (day == 7) {
            System.out.println(day + "is Sunday");
        }
    }

    public void if_else_if_else(int day) {
        if (day == 1) {
            System.out.println(day + "is Monday");
        } else if (day == 2) {
            System.out.println(day + "is Tuesday");
        } else if (day == 3) {
            System.out.println(day + "is Wednesday");
        } else if (day == 4) {
            System.out.println(day + "is Thursday");
        } else if (day == 5) {
            System.out.println(day + "is Friday");
        } else if (day == 6) {
            System.out.println(day + "is Saturday");
        } else {
            System.out.println(day + "is Sunday");
        }
    }

    public void switch1(int day) {
        switch (day) {
            case 1:
                System.out.println(day + "is Monday");
                break;
            case 2:
                System.out.println(day + "is Tuesday");
                break;
            case 3:
                System.out.println(day + "is Wednesday");
                break;
            case 4:
                System.out.println(day + "is Thursday");
                break;
            case 5:
                System.out.println(day + "is Friday");
                break;
            case 6:
                System.out.println(day + "is Saturday");
                break;
            case 7:
                System.out.println(day + "is Sunday");
                break;
            default:
                System.out.println(day + "is INVALID");
                break;
        }
    }

    public static void main(String[] args) {
        p_09 p = new p_09();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Day Number from 1 to 7 : ");
        int day = sc.nextInt();

        if (day >= 1 && day <= 7) {
            p.multi_if(day);
            p.if_else_if_else(day);
            p.switch1(day);
        }
    }
}
