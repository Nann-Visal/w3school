public class DemoPrivatePubli {
    public static void main(String[] args){
        PrivatePublic obj =new PrivatePublic();
        //obj.x = 10; no access
        obj.y = 100;
        obj.z = 1000;
        obj.setX(20);
        System.out.println("X = " + obj.getX());
        System.out.println("Y = " + obj.y);
        System.out.println("Z = " + obj.z);
    }
}
