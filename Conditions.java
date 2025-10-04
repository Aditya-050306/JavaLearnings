import java.util.Scanner;

class Conditions {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1= sc.nextInt();
        System.out.println("Enter second number:");
        int num2= sc.nextInt();
        System.out.println("Enter\n + for addition\n - for Subtraction\n * for multiplication\n / for division");
        String input=sc.next();
        if(input.equals("+")){
            System.out.println("Addition: "+(num1+num2));
        }
        else if(input.equals("-")){
            System.out.println("Subtraction: "+(num1-num2));
        }
        else if(input.equals("*")){
            System.out.println("Multiplication: "+(num1*num2));
        }
        else if(input.equals("/")){
            System.out.println("Division: "+(num1/num2));
        }
        else{
            System.out.println("Wrong Input");
        }
    }
}
