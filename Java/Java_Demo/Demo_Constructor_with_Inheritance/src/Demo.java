public class Demo {
    public static void main(String[] args){
        Triangle obj = new Triangle("iso" , 5.0 , 8.0);
                System.out.println("All Information of Obj");
                obj.showStyle();
                obj.showWH();
                System.out.println("Area : "+obj.area());
    }
}
