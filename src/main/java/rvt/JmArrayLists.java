package rvt;
    import java.util.*;
public class JmArrayLists {
    public static void main(String[] args) {
        onlyTheseNumbers();
    }
    public static void onlyTheseNumbers() {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            System.out.print("Enter a number (-1 to stop) :");
            int num = Integer.parseInt(reader.nextLine());
            if (num == -1) {
                break;
            }
            numbers.add(num);
        }


        System.out.print("Enter start index: ");
        int start = Integer.parseInt(reader.nextLine());

        System.out.print("Enter end index: ");
        int end = Integer.parseInt(reader.nextLine());

        
        System.out.println("Numbers in the range [" + start + ", " + end + "]:");
        for (int i = start; i <= end; i++) {
            System.out.println(numbers.get(i));
        }

        reader.close();
    }
}
        
    

