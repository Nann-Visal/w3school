public class DemoSuper_re {
    public static void main(String[] args){
        X x = new X(10);
        X x1;
        Y y = new Y(7,8);
        x1=x;
        System.out.println("X1.a: "+ x1.a);
        x1=y;
        System.out.println("x1.a: "+x1.a);
    }
}
