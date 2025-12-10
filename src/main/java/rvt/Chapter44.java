package rvt;

import java.util.Scanner;

public class Chapter44 {
    public static void main(String[] args) {
        ex7();
    }
    public static void ex1(){
            try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your name:");
            String name = scanner.nextLine();

            name = name.trim();

            int firstSpace = name.indexOf(' ');

            if (firstSpace == -1) {

                System.out.println(name);
                return;
            }

            int secondStart = firstSpace + 1;
            while (secondStart < name.length() && name.charAt(secondStart) == ' ') {
                secondStart++;
            }

            if (secondStart >= name.length()) {

                System.out.println(name);
                return;
            }

            int secondEnd = name.indexOf(' ', secondStart);

            String beforeSecond = name.substring(0, secondStart);
            String secondWord;
            String afterSecond = "";

            if (secondEnd == -1) {
                secondWord = name.substring(secondStart);
            } else {
                secondWord = name.substring(secondStart, secondEnd);
                afterSecond = name.substring(secondEnd);
            }

            String result = beforeSecond + secondWord.toUpperCase() + afterSecond;

            System.out.println(result);
        
            }
        }
        public static void ex2(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a string:");
            String input = scanner.nextLine();

            
            for (int i = 0; i < input.length(); i++) {
                System.out.println(input.charAt(i));
            }

            
            }
        }
        public static void ex3(){
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Enter your name:");
                String name = scanner.nextLine();
                if (name.isEmpty()){
                    break;
                }
                if (name.startsWith("Amy") || name.startsWith("Buffy") || name.startsWith("Cathy")){
                    System.out.println("Ms." + name);
                }
                else if(name.startsWith("Elroy") || name.startsWith("Fred") || name.startsWith("Graham")){
                    System.out.println("Mr." + name);
                }
                else{
                    System.out.println(name);
                }
            }
        }
    }
        public static void ex4(){
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.println("Enter the time as a sequence of digits:");
                String input = scanner.nextLine();

                String digits = input.replaceAll("\\D", "").trim();

                if (digits.isEmpty()) {
                    System.out.println("0:00");
                    return;
                }

                int minutes = 0;
                int seconds = 0;

                if (digits.length() <= 2) {
                
                    seconds = Integer.parseInt(digits);
                } else {
            
                    int n = digits.length();
                    String secPart = digits.substring(n - 2);
                    String minPart = digits.substring(0, n - 2);
                    seconds = Integer.parseInt(secPart);
                    minutes = Integer.parseInt(minPart);
                }

        
                System.out.printf("%d:%02d%n", minutes, seconds);
        }
    }
    public static void ex6(){
        try (Scanner scanner = new Scanner(System.in)) {
            boolean invalid;
            do{
                invalid = passwordCheck(scanner);
            }while(invalid);
        }
    }

    public static boolean passwordCheck(Scanner scanner){
        System.out.println("Enter your password:");
        String password = scanner.nextLine();
        if (password.length() < 8){
            System.out.println("Password is too short");
            return true;
        }
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        for (int i = 0; i < password.length(); i++){
            char c = password.charAt(i);
            if (Character.isUpperCase(c)){
                hasUpper = true;
            }
            if (Character.isLowerCase(c)){
                hasLower = true;
            }
            if (Character.isDigit(c)){
                hasDigit = true;
            }
        }
        if (hasUpper && hasLower && hasDigit){
            System.out.println("Password is acceptable");
            return false;
        } else {
            System.out.println("Password is not acceptable");
            return true;
        }
    }
    public static void ex7(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a word:");
            String word = scanner.nextLine();
            String current = word;
            String space = "";
            while (current.length() > 0) {
                System.out.println(space + current);
                if (current.length() <= 1) {
                    break;
                }
                current = current.substring(1, current.length() - 1);
                space = space + " ";
            }
        }
    }

}

