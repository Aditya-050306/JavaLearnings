import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        System.out.print("Enter size of array ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int number[]= new int[size];
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.println(number[i]);
        }
        System.out.println("Enter number to search ");
        int x=sc.nextInt();
        for(int i=0;i<size;i++){
            if(x==number[i]){
                System.out.print(i);
            }
            
        }
       sc.close();
    }
}
