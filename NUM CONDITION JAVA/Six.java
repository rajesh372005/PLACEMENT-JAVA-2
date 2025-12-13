import java.util.Scanner;
public class Six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        int greatest = a;
        if(b > greatest) 
        greatest = b;
        if(c > greatest)
         greatest = c;
        System.out.println("Greatest number is: " + greatest);
    }
}
