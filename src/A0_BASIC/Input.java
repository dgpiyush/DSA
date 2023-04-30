package A0_BASIC;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Num2: ");
        int num2 = sc.nextInt();

        sc.close();

        System.out.println("Sum Of " + num1 + "+" + num2 + "=" + sum(num1, num2));
    }

    static int sum(int a, int b) {
        return a + b;
    }

}
