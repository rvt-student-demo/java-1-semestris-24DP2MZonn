package rvt;
    import java.util.*;
public class JmArrayLists {
    public static void main(String[] args) {
        removeLast();
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
    public static void Listsize() {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> wordStrings = new ArrayList<>();
        

        while(true){
            System.out.print("Put your name (To exit enter ''): ");
            String name = reader.nextLine();
                if(name.equals("")){
                    break;
                }
                wordStrings.add(new String(name));
            
        }
        System.out.println("Size: " + wordStrings.size());
        
    }
    public static void onTheList(){
        Scanner reader = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();

        while(true){
            System.out.print("Put your name (To exit enter ''): ");
            String name = reader.nextLine();
                if(name.equals("")){
                    break;
                }
                strings.add(new String(name));
            
        }
        System.out.println("Search for? ");
        String name = reader.nextLine();
        if(strings.contains(reader.nextLine())){
            System.out.println(name + " was found!");
        }
        else{
            System.out.println(name + " was not found!");
        }
        

    }
    public static void removeLast() {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> wordStrings = new ArrayList<>();
        

        while(true){
            System.out.print("Put your name (To exit enter ''): ");
            String name = reader.nextLine();
                if(name.equals("")){
                    break;
                }
                wordStrings.add(new String(name));
            
        }
        if(wordStrings.size() == 0){
            System.out.println(wordStrings);
        }  
        else{
            wordStrings.remove(wordStrings.size()- 1);
            System.out.println(wordStrings);
        }
        
        
    }
}
        
    

