public class Continue {
    public static void main(String[] args) {
        Loop1: for(int i=1;i<100;i++){
            System.out.println(" ");
            if(i>=10)
                break;
            
            for(int j=1;j<100;j++){
                System.out.println("*");
                if(j==i)
                continue Loop1;  
                
            }
        }
        System.out.println("Exited");

    }
}
