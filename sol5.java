import java.util.Scanner;
public class sol5 {
    public static int age(int a){
        if(a >= 18){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }
        return a;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int age = age(a);
        System.out.println(age);
    }
    
}
