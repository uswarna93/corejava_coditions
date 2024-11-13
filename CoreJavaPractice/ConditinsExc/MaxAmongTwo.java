import java.util.Scanner;

public class MaxAmongTwo {
    public static void main(String[] args) {
        System.out.println("enter two positive intergers");
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int j=sc.nextInt();
        if(i>j){
            System.out.println(+i+" is big nummer");

        }else{
            System.out.println(+j+" is big nummer");
        }
    }
    
}
