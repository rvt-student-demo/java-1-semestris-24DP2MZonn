package rvt;

import java.util.Scanner;

public class Sumofnumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int ciparuskaits = 0;
        int  sum = 0;
        while (true) {
            System.out.println("Give me a number:");
            int cipars = reader.nextInt();
            if (cipars == 0) {
            break;
             }
             ciparuskaits = ciparuskaits + 1;
            sum = sum + cipars;
        }
        System.out.println("Ciparu skaits:" + ciparuskaits);
        System.out.println("Skaitļu summa" + sum);
        reader.close();
    }
}
