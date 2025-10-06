import java.util.*;

public class Function1 {
    public static int calculateSum(int a, int b){
        int sum= a+b;
        return sum;
    }
    public static void main(String[] args) {
        System.out.print("Enter a and b\t");
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b= sc.nextInt();
        int sum= calculateSum(a,b);
        System.out.print("Sum="+ sum);
    }
}
