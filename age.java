import java.util.Scanner;
public class age{
    public static void main(String[] args){
    Scanner sc =new Scanner(System.in);

        System.out.println("enter your name");
        String name = sc.nextLine();
        System.out.println(name);

        System.out.println("enter your addaress");
        String add = sc.nextLine();
        System.out.println(add);

        System.out.println("enter your mobilenumber");
        String mobile = sc.nextLine();
        System.out.println(mobile);

        System.out.println("enter your percentage");
        float percentage = sc.nextFloat();
        System.out.println(percentage);

        System.out.println("enter your age ");
        int age = sc.nextInt();
        System.out.println(age);
    }
}