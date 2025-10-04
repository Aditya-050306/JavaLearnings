import java.util.Scanner;
public class Exercise {
    public static void main(String[] args) {
      int a,b,c;
      System.out.println("Enter a and b\t");
      Scanner sc=new Scanner(System.in);
      a=sc.nextInt();
      b=sc.nex                                                                                       t();
      c=a-b;
      if(c>0){
        System.out.println("Positive");
      }
      else{
        System.out.println("Negative");
      }
      sc.close();
    }
}
