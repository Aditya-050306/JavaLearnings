import java.util.Scanner;
public class SwitchExample{
    public static void main(String[] args) {
        int a,b,c,d,e,f,n,sum,average;
        System.out.println("Enter any 6 positive numbers");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        e=sc.nextInt();
        f=sc.nextInt();
        System.out.println("Enter 1 for Smallest number");
        System.out.println("Enter 2 for Largest number");
        System.out.println("Enter 3 for Sum of all number");
        System.out.println("Enter 4 for Average of all number");
        n=sc.nextInt();
        switch(n){
            case 1:
            if(a<b && a<c &&a<d && a<e && a<f){
                System.out.println("Smallest number is:"+a);
            }
            else if(b<a && b<c && b<d && b<e && b<f){
                System.out.println("Smallest number is:"+b);
            }
            else if(c<a && c<b && c<d && c<e && c<f){
                System.out.println("Smallest number is:"+c);
            }
            else if(d<a && d<b && d<c && d<e && d<f){
                System.out.println("Smallest number is:"+d);
            }
            else if(e<a && e<b && e<c && e<d && e<f){
                System.out.println("Smallest number is:"+e);
            }
            else{
                System.out.println("Smallest number is:"+f);
            }
            break;
            
            case 2:
            if(a>b && a>c &&a>d && a>e && a>f){
                System.out.println("Largest number is:"+a);
            }
            else if(b>a && b>c && b>d && b>e && b>f){
                System.out.println("Largest number is:"+b);
            }
            else if(c>a && c>b && c>d && c>e && c>f){
                System.out.println("Largest number is:"+c);
            }
            else if(d>a && d>b && d>c && d>e && d>f){
                System.out.println("Largest number is:"+d);
            }
            else if(e>a && e>b && e>c && e>d && e>f){
                System.out.println("Largest number is:"+e);
            }
            else{
                System.out.println("Largest number is:"+f);
            }
            break;
            
            case 3:
            sum=a+b+c+d+e+f;
            System.out.println("Sum of all numbers is: "+sum);
            break;

            case 4:
            average=(a+b+c+d+e+f)/6;
            System.out.println("Average of all numbers is: "+average);
            break;

            default:
            System.out.println("Invalid Input");
            break;
        }
        sc.close();
    }
}