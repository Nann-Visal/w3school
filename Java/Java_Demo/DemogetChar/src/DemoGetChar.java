public class DemoGetChar {
    public static void main(String[] arg){
        String str="this is the demo of get char method";
        int start=10;
        int end=14;
        char ch[]= new char[end-start];
        str.getChars(start,end,ch,0);
        System.out.println(ch);
    }
}
