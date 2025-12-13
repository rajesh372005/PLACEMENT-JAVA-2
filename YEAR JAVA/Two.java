import java.util.Scanner;
public class Two{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        if(a%100==0)
        {
            System.out.println("century");
        }
        else{
            System.out.println("no century");
        }
    }
}