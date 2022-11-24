public class DemoString {
    public static void main(String[] args) {
        char ch[]={'C','H','A','R','A','C','T','E','R'};
        byte ascii[]={65,66,67,68};
        String s1=new String();
        String s11="MY STRING";
        String s2=new String(ch);
        String s3=new String(ch,3,8);
        String s4=new String(s2);
        String s5=new String(ascii);
        String s6=new String(ascii,1,3);
        s1="CHARACTER";
        System.out.println(s1);
        System.out.println(s11);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
    }
}
