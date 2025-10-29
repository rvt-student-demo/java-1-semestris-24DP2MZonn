package rvt;

public class FromParameterToOne {
    public static void main(String[] args) {
        printFromNumberToOne(5);
    }
    public static void printFromNumberToOne(int end) {
        for (int i = end; i > 0; i-- ) {
            System.out.println(i);
        }
    }
}
