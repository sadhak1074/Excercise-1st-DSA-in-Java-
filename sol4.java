import java.util.Scanner;
public class sol4 {
    public static Double circumference(int r){
        double pi = 3.14;
        double circumference = 2 * pi * r;
        return circumference;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double circumference = circumference(r);
        System.out.println(circumference);
    }
}