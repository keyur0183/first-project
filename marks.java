import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter the hindi subject marks");
        int a =s1.nextInt();
        System.out.println("enter the gujarati subject marks");
        int b = s1.nextInt();
        System.out.println("enter the computer subject marks");
        int c = s1.nextInt();
        int Sum=a+b+c/3;
        System.out.println("enter the percentage");
        System.out.println(Sum);





    }
    
}
