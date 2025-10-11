public class ClearBit {
    public static void main(String[] args) {
        int num=5;
        int pos=2;
        int bitMask=1<<pos;

        int notbitMask= ~(bitMask);

        int newNumber= notbitMask & num;
        System.out.println(newNumber);
    }
}
