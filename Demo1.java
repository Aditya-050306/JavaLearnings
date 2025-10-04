import java.util.*;
class A{
    String name;
    A(){
        System.out.println("A constructor called");
    }   
}
class B extends A{
    int age;
    B(){
        System.out.println("B constructor called");
    }
}
class C extends B{
    C(){
        System.out.println("C constructor called");
    }
    void show(){
        System.out.println("Name=" + name );
        System.out.println("Age= "+age);
    }
}


public class Demo1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        C c= new C();
        System.out.print("Enter Name\t");
        c.name=sc.nextLine();
        System.out.print("Enter Age\t");
        c.age=sc.nextInt();
        c.show();
        sc.close();
    }
}
