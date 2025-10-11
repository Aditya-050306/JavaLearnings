public class StringBuild {
    public static void main(String[] args) {
        StringBuilder name= new StringBuilder("Tony");
        name.insert(0,"S");
        System.out.println(name);
        name.delete(0,1);
        System.out.println(name);
        name.append(" Stark");
        System.out.println(name);
        System.out.println(name.length());
    }
}
