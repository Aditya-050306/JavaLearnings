
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
       
        System.out.println("Enter number rows and columns");
        Scanner sc= new Scanner(System.in);
        int rows=sc.nextInt();
        int cols= sc.nextInt();
        int arr[][]=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter element to search");
        int x=sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(arr[i][j]==x){
                    System.out.print(i+" ");
                    System.out.print(j);
                }
            }
        }
        sc.close();
    }
}
