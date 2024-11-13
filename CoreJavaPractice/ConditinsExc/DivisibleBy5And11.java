//To check a program which divisible by 5 and 11

import java.util.Scanner;

public class DivisibleBy5And11 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%11==0)
        {
            System.out.println(+n+" is divisible by 11 ");
        }
         else if(n%5==0)
        {
            System.out.println(+n+" divisible by 5");
        }

       else{
        System.out.println(+n+" is not divisible by 5 and 11");
           }
        }
}
