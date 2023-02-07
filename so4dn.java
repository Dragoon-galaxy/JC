import java.util.Scanner;

public class Abhi{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int br,store;
    System.out.println("Enter a four digit number:");
    int n =sc.nextInt();

    for(store=0;n>0;n=n/10)
    {
         br=n%10;
         store+=br;
    }
    System.out.println("Sum of four digit number is: "+ store);
    sc.close();
}
}