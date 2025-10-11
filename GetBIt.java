public class GetBIt {
    public static void main(String[] args) {
        int num=5;
        int pos=3;
        int bitMask=1<<pos;
        if((bitMask & num)>0){
            System.out.println("Bit was one");
        }
        else{
            System.out.println("Bit was zero");
        }
    }
}
