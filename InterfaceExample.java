interface  A{
    void methodA();
    void methodB();
}
interface B{
    void methodC();
    void methodD();
}
class C implements A,B{
    public void methodA(){
        System.out.println("Aayush");
    }
    public void methodB(){
        System.out.println("Abhay");
    }
    public void methodC(){
        System.out.println("Abhinav");
    }
    public void methodD(){
        System.out.println("Aditya");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        C c=new C();
        c.methodA();
        c.methodB();
        c.methodC();
        c.methodD();
    }
}
