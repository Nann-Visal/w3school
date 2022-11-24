public class DemoReturne {
    public static void main(String[] agr){
        boolean b = true;
        System.out.println("Here before call return");
        if(b==true) return;
        System.out.println("After return ");//not execute
    }
}
