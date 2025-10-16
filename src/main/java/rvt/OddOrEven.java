package rvt;
    import java.util.*;
public class OddOrEven {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.println("Give me your number:");
            int cipars = reader.nextInt();
            if (cipars % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }
    }
}
