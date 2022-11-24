package Lab11.Visal1.com;

public class DemoPassword {
    public static void main(String[] args){
        String password = "Visal";
        String key="$";
        String en=" ";
        for(int i=0 ; i<password.length() ; i++){
            char ch=password.charAt(i);
            en=en+ch+key;
        }
        System.out.print(en);
        System.out.println();
        String de=" ";
        for(int i=0 ; i<en.length() ; i++){
            if(i%2!=0){
                de += en.charAt(i);
            }
        }
        System.out.print(de);
    }
}
