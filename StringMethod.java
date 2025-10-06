
import java.util.Scanner;

public class StringMethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        do { 
            System.out.println("Enter your Choice");
            n=sc.nextInt();
            switch(n){
                case 1:
                length(sc);
                break;
                case 2:
                charAt(sc);
                break;
                case 3:
                indexOf(sc);
                break;
                case 4:
                equals(sc);
                break;
                case 5:
                compareTo(sc);
                break;
                case 6:
                concat(sc);
                break;
                case 7:
                substring(sc);
                break;
                case 8:
                replace(sc);
                break;
                case 9:
                trim(sc);
                break;
            } 
        }while(n!=10);       
        sc.close();
    }
    static void length(Scanner sc){
        String word1=sc.next();
        System.out.println("Length of string is: "+ word1.length());
    }
    static void charAt(Scanner sc){
        String word1=sc.next();
        int i;
        System.out.println("Enter index number");
        i=sc.nextInt();

        System.out.println("Character at index "+i+" is: "+ word1.charAt(i));
    }
    static void indexOf(Scanner sc){
        String word1=sc.next();
        String j;
        System.out.println("Enter character");
        j=sc.next();
        System.out.println("Index of character" +j+" is: "+ word1.indexOf(j));
    }
    static void equals(Scanner sc){
        String word1=sc.next();
        String word2=sc.next();
        System.out.println("Are both strings equal? "+ word1.equals(word2));
    }
    static void compareTo(Scanner sc){
        String word1=sc.next();
        String word2=sc.next();
        System.out.println("Comparison result: "+ word1.compareTo(word2));
    }
    static void concat(Scanner sc){
        String word1=sc.next();
        String word2=sc.next();
        System.out.println("Concatenated string: "+ word1.concat(word2));
    }
    static void substring(Scanner sc){
        String word1=sc.nextLine();
        System.out.println("Substring from index 0 to 5: "+ word1.substring(0, 5));
    }
    static void replace(Scanner sc){
        String word1=sc.nextLine();
        System.out.println("String after replacement: "+ word1.replace('o', 'a'));
    }
    static void trim(Scanner sc){
        String word1=sc.nextLine();
        System.out.println("Trimmed string: '"+ word1.trim() + "'");
    }
}
