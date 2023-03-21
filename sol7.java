import java.util.Scanner;

public class sol7 {
    public static void main(String[] args) {
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter a number (or enter 0 to stop): ");
            int num = input.nextInt();
            
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
            
            if (num == 0) {
                break;
            }
        }
        
        System.out.println("Positive numbers entered: " + positiveCount);
        System.out.println("Negative numbers entered: " + negativeCount);
        System.out.println("Zeros entered: " + zeroCount);
    }
}
