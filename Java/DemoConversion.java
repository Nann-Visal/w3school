public class DemoConversion{
    public static void main(String[] args){
        byte b;
        int i=235;
        double d=123.456;
        b=(byte)i;
        System.out.println("Conversion of int to byte.");
        System.out.println("i and b :" + i +":" + b);
        b=(byte)d;
        System.out.println("Conversion of double to byte.");
        System.out.println("d and b :" + d +":" + b);
        i=(int)d;
        System.out.println("Conversion of double to int.");
        System.out.println("d and i :" + d +":" + i);
    }
}
