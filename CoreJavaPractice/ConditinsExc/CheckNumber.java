//To check a number is +ve , _ve or Zero

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
       
        if(a>0){
            System.out.println(+a+": is positive number");
        }else  if(a<0){
            System.out.println(+a+": is negative number");
        }else  
            System.out.println(+a+": is zero");
        }
}

