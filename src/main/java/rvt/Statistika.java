package rvt;

import java.util.Scanner;

public class Statistika {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create Statistics objects in this exact order: all, even, odd
        Statistics all = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();

        System.out.println("Enter numbers, -1 ends:");
        while (true) {
            if (!scanner.hasNextInt()) {
                // if non-integer input, consume and continue
                scanner.next();
                continue;
            }
            int number = scanner.nextInt();
            if (number == -1) {
                break;
            }
            all.addNumber(number);
            if (number % 2 == 0) {
                even.addNumber(number);
            } else {
                odd.addNumber(number);
            }
        }

        System.out.println("Sum: " + all.sum());
        System.out.println("Sum of even numbers: " + even.sum());
        System.out.println("Sum of odd numbers: " + odd.sum());
        scanner.close();
    }
    public static class Statistics{
        private int count;
        private int sum;

        public Statistics() {
            this.count = 0;
            this.sum = 0;
        }

        public void addNumber(int number) {
            this.count++;
            this.sum += number;
        }

        public int getCount() {
            return this.count;
        }
        public int sum(){
            return this.sum;
        }
        public double average(){
            if(this.count == 0){
                return 0.0;
            }
            return (double)this.sum / this.count;
        }
    }

}

