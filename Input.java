import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name");
        String username= sc.nextLine();
        System.out.println("Enter you age");
        int age= sc.nextInt();

        System.out.println("Your Name:"+username);
        System.out.println("Your Age:"+age);

    }
}
