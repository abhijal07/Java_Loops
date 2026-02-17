// Prints all odd numbers between 1 and 50 using a loop.

public class PrintOddNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
