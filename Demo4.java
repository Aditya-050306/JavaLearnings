
class Animal {
    String color = "White";

    Animal() {
        System.out.println("Animal constructor called");
    }

    void eat() {
        System.out.println("Animal eats food");
    }
}
class Dog extends Animal {
    String color = "Black";

    Dog() {
        
        super();
        System.out.println("Dog constructor called");
    }

    void displayColor() {
        // Access parent class variable using super
        System.out.println("Dog color: " + color);
        System.out.println("Animal color: " + super.color);
    }

    void eat() {
        System.out.println("Dog eats bones");
        // Call parent class method
        super.eat();
    }
}


public class Demo4 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.displayColor();
        d.eat();
    }
}
