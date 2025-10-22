package rvt;
    import java.util.*;
public class Delikateses {
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Ievadi preci:");
        String prece = reader.nextLine();
        System.out.println("Ievadi cenu:");
        double cena = reader.nextDouble();
        System.out.println("Ekspress piegadi (ja == 1) vai (ne == 0):");
        int Ekspress = reader.nextInt();
        double piegāde = 0;
        if (cena < 10) {
           piegāde += 2;
        }
        if (Ekspress == 1) {
            piegāde += 3;

        }
        double summa = cena + piegāde ;

        System.out.println("Rekins:");
        System.out.println("  " + prece + "  " + cena);
        System.out.println("  Piegade  " + piegāde);
        System.out.println("  Kopa:   " + summa);
    }
}