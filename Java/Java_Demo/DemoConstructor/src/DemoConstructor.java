public class DemoConstructor {
    public static void main(String[] args){
        Construc obj = new Construc();
        System.out.println("Before assign x and y ");
        System.out.println("x = "+ obj.x);
        System.out.println("y = "+ obj.y);
        System.out.println("x*y = "+ obj.mul());
        obj.x=20;
        obj.y=30;
        System.out.println("After");
        System.out.println("x = "+ obj.x);
        System.out.println("y = "+ obj.y);
        System.out.println("x*y = "+ obj.mul());
    }
}
