import java.util.Scanner;
class MyProgram {
    public static void main(String[] args) {


    Scanner sc=new Scanner(System.in);
    AreaCube a1=new AreaCube();
    System.out.println("Enter Side");
    float side= sc.nextFloat();
        System.out.println("Area:"+area);
}}

class AreaCube{
    float side;
    public void area(){
        a1.area=side*side*side;
    }
}
