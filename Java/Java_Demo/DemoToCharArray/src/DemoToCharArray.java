public class DemoToCharArray {
    public static void main(String[] arg){
        String str=new String("This is demo of toCharArray method.");
        char ch[];
        ch=str.toCharArray();
        for(int i=0;i<str.length();i++){
            System.out.println(ch[i]);
        }
    }
}
