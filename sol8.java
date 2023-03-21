import java.util.Scanner;
public class sol8 {
    public static void power(int x, int n){
        System.out.println(Math.pow(x, n));
        return;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = input.nextInt();
        System.out.print("Enter a power: ");
        int n = input.nextInt();
        power(x, n);
    }
}
