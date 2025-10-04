import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        int n,i=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number\t");
        n=sc.nextInt();
        System.out.println("Factors of "+n+" are:");
        for(i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
                
            }
        }
        sc.close();
    }
}
