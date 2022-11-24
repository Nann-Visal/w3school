public class OverloadingConstructor {
    public static void main(String[] args){
        OverCon obj1 = new OverCon();
        OverCon obj2 = new OverCon(12);
        OverCon obj3 = new OverCon(15.67);
        OverCon obj4 = new OverCon(12,23.67);
        System.out.println("Value of other obj");
        obj1.prnt();
        obj2.prnt();
        obj3.prnt();
        obj4.prnt();
    }
}
