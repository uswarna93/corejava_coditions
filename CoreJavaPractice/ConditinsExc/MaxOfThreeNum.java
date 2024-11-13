import java.util.Scanner;

public class MaxOfThreeNum {
    public static void main(String[] args) {
        System.out.println("Enter three positive integers");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if (a>b && a>c) {
            System.out.println(+a+" : is big number");
        }
        else if (b>c && b>a) {
            System.out.println(+b+" : is big number");
        }   
        else
        {
            System.out.println(+c+" : is big number");
        }

    }
    
    
}
