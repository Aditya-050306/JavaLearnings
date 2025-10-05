import java.util.*;
public class Factorial {
    public static void calcFactorial(int n){
        int fact=1;
        if(n<0){
            System.out.println("Invalid Input");
            return;
        }else{
            for(int i=1;i<=n;i++){
                fact=fact*i;
            }
           
        }
        System.out.println("Factorial of number= "+fact);
        
    }
    public static void main(String[] args) {
        System.out.print("Enter any Number ");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        calcFactorial(n);
        
        sc.close();
    }
}
