package rvt;
    import java.util.*;
public class GradesAndPoints {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.println("Give me your grade:");
            int cipars = reader.nextInt();
            if (cipars < 0) {
                System.out.println("Impossible!");
            } else if (cipars == 0 || cipars <= 49) {
                System.out.println("Failed");
            }else if (cipars == 50 || cipars <= 59) {
                System.out.println("1");
            }else if (cipars == 60 || cipars <=69) {
                System.out.println("2");
            }else if (cipars == 70 || cipars <= 79) {
                System.out.println("3");
            }else if (cipars == 80 || cipars <= 89) {
                System.out.println("4");
            }else if (cipars == 90 || cipars <= 100) {
                System.out.println("5");
            }else if (cipars > 100) {
                System.out.println("Incredible");
            }
        }
    }
}
