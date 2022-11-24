import java.nio.charset.StandardCharsets;

public class DemoGetBytes {
    public static void main(String[] arg){
        String str="Now we demo about how to use get bytes method";
        byte b[]=str.getBytes();
        for(int i=0;i< b.length;i++){
            System.out.println((char) b[i]);
        }
    }
}
