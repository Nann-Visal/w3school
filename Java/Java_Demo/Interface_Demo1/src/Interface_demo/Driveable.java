package Interface_demo;

public interface Driveable {
    boolean startEngine();
    void stopEngine();
    float accelerate(float acc);
    boolean turn(String direction);
}
