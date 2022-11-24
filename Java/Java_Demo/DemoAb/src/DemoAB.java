public class DemoAB {
    public static void main(String[] args){
        ClassA obj1 = new ClassA();
        ClassA.B obj2 = obj1.new B();
        obj1.x = 4;
        obj1.y = 8;
        obj2.z = 9;
        System.out.println("sum= "+ obj2.mysum());
    }
}
