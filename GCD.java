
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        int gcd = 1;
    

        for (int i=1 ;  i<=a ; i++){
            if(a%i==0&&b%i==0){
                gcd = i;
            }

        }
         System.out.println("Greateest common divisor between "+a+" and "+b+" is:"+gcd);
    }
}
