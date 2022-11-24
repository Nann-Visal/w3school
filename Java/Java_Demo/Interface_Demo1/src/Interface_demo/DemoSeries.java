package Interface_demo;

public class DemoSeries {
    public static void main(String[] arg){
        ByTwos obj = new ByTwos();
        for(int i=0;i<10;i++){
            System.out.print(obj.getNext()+" ");
        }
        System.out.println();
        System.out.println("Resetting the value");
        obj.reset();
        for(int i=0;i<10;i++){
            System.out.print(obj.getNext()+" ");
        }
        System.out.println();
        System.out.println("Setting start value");
        obj.setStart(23);
        for(int i=0;i<10;i++){
            System.out.print(obj.getNext()+" ");
        }
        System.out.println("\n====================================================");
        Automobile obja = new Automobile();
        obja.startEngine();
        obja.stopEngine();
        obja.accelerate(30);
        obja.turn("right");
    }
}
