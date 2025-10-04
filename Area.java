
import java.util.Scanner;

class RectArea{
    float height;
    float width;
    float calcArea(){
    return height*width;
    }

}
 public class Area{
    public static void main(String[] args) {
       
        Scanner sc= new Scanner(System.in);
        RectArea a1= new RectArea();
        System.out.println("Enter Height: ");
        a1.height=sc.nextFloat();
        System.out.println("Enter Width: ");
        a1.width=sc.nextFloat();
        float area=a1.calcArea();
        System.out.println("Area of Rectangle:"+area);
        sc.close();
    }

}
