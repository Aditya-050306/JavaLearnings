import java.util.*;
public class Odd {
    public static void main(String[] args) {
        int n,i=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        n=sc.nextInt();
        while(i<=n){
            if(i%2==1){
                System.out.println(i);
                i++;
                
            }
            else{
                i++;
                continue;
            }
            
        }
        sc.close();
    }
}
