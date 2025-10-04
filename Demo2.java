class A {
    int x, y;
    void show() {
        System.out.println("x=" + x + " y=" + y);
    }
}
class B extends A {
    int z;
    void show2() {
        System.out.println("z= " +z);
    }
}
class C extends B{
    void area() {
        System.out.println("Area of Cuboid=" + (x * y * z));
    }
} 
public class Demo2{
    public static void main(String[] args) {
        C d = new C();
        d.x = 10;
        d.y = 20;
        d.z = 10;
        d.show();
        d.show2();
        d.area();
    }
}

