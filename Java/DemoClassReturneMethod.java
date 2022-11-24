class Vehicle{
    int passengers;
    int fuelcap;
    int mpg;
    int rang(){
        return(fuelcap*mpg);
    }
}
public class DemoClassReturneMethod {
    public static void main(String[] arg){
        Vehicle minibus = new Vehicle();
        Vehicle minicar = new Vehicle();
        minibus.passengers = 12;
        minibus.fuelcap = 60;
        minibus.mpg = 10;
        minicar.passengers = 5;
        minicar.fuelcap = 45;
        minicar.mpg = 13;
        System.out.println("Minibus can carry : " + minibus.passengers + " " + "With the range of : "+ minibus.rang());
        System.out.println("Minicar can carry : " + minicar.passengers + " " + "With the range of : " + minicar.rang());
    }
}
//erro