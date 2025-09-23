package rvt;
    import java.util.Scanner;

public class Produkts {
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Ievadi produktu");
        String Nosaukums = reader.nextLine();
        System.out.println("Ievadi produkta skaitu");
        int produktuskaits = reader.nextInt();
        System.out.println("Ievadi produkta cenu");
        double produktacena = reader.nextDouble();
        System.out.println("Produkts" + Nosaukums);
        System.out.println("Cena:" + produktacena);
        System.out.println("Daudzums" + produktuskaits);
        System.out.println("Kopējā cena:" + produktuskaits * produktacena);


        reader.close();
    }
}
