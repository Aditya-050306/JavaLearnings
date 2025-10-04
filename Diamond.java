
import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        int n,i=1,j=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                System.out.println(" ");
            }
            for(j=1;j<=(2*i-1);j++){
                System.out.println("*");
            }
            System.out.println();
        }
        for(i=n-1;i>=1;i--){
            for(j=n;j>i;j--){
                System.out.println(" ");
            }
            for(j=1;j<=(2*i-1);j++){
                System.out.println("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
