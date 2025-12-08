package rvt;
    import java.util.*;
public class Spele {
    public static void main(String[] args) {
        Random rand = new Random();
        int index = 0;
        System.out.println("Es domāju par skaitli no 1 līdz 10");
        System.out.println(" Tev tas jāuzmin trīs mēģinājumos");
        int numbers = rand.nextInt(10);
        Scanner reader = new Scanner(System.in);
        while(index < 3){
            System.out.println("Tavs minējums: ");
            int guessnumber = reader.nextInt();
            if (numbers == guessnumber){
            System.out.println("Pareizi");
            System.out.println("Tu esi uzvarējis");
            }
            else{
                System.out.println("Nepareizi");
            index ++;
            }
    
  
        }
    System.out.println("Pareizais skaitlis bija " + numbers);
    System.out.println("Tu esi zaudējis");
    }
}
