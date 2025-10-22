package rvt;
    import java.util.*;
public class RepeatingBreakingAndRemembering {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Give numbers: ");
        Scanner reader = new Scanner(System.in);
        
        while (true) {
            int number = reader.nextInt();
            
            if (number == -1) {
                break;
            }
        sum = sum + number;
        }
        System.out.println("Thx! Bye! ");
        System.out.println("Sum: " + sum);
    }
}
