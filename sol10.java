import java.util.Scanner;

public class sol10 {
    public static void main(String[] args) {
        // create Scanner object to get user input
        Scanner input = new Scanner(System.in);

        // get input from user
        System.out.print("Enter the number of terms to print in Fibonacci series: ");
        int n = input.nextInt();

        // print the first two terms of Fibonacci series
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");

        // print the remaining terms of Fibonacci series
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}

