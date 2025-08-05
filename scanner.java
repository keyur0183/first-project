import java.util.Scanner;
public class scanner {

    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number1");
        int a= sc.nextInt();
        System.out.println("enter the number2");
        int b=sc.nextInt();
         int Sum= a+b;
         System.out.println("output is");
         System.out.println(Sum);


    }
}