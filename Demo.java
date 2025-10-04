
class Base {
    int x, y;
    void show() {
        System.out.println("x=" + x + " y=" + y);
    }
}
class Derived extends Base {
    void area() {
        System.out.println("Area of Rectangle=" + (x * y));
    }
}
public class Demo{
    public static void main(String[] args) {
        Derived d = new Derived();
        d.x = 10;
        d.y = 20;
        d.show();
        d.area();
    }
}