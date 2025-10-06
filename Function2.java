import java.util.*;

public class Function2 {
    public static int calculateProduct(int a,int b){
        int product= a*b;
        return product;
    }
    public static void main(String[] args) {
        System.out.print("Enter a and b ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int product= calculateProduct(a,b);
        System.out.println("Product of 2 Numbers= "+ product);
        sc.close();
    }
}
