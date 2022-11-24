public class DemoInher {
    public static void main(String[] args){
        Traingle obj = new Traingle();
        obj.width = 4.0;
        obj.height = 5.0;
        obj.style = "iso_style";
        System.out.println("All information of OBJ");
        obj.showStyle();
        obj.showWH();
        System.out.println("The area : " + obj.area());
    }
}
