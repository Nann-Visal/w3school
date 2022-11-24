package Interface_demo;

public class Automobile implements Driveable{
    public boolean startEngine() {
        System.out.println("the machine is running now");
        return false;
    }
    public void stopEngine() {
        System.out.println("the machine is stopped now");
    }
    public float accelerate(float acc) {
        System.out.println("the car speed add "+acc+"more please drive carefully" );
        return 0;
    }
    public boolean turn(String direction) {
        System.out.println("now, the car turn "+direction);
        return false;
    }
}
