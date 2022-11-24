//define class 
class Vehicle{
    int passengers;
    int fuelcap;
    int mpg;
}
public class DemoClass {
    public static void main(String[] args){
        //define object for my class
        Vehicle minibus = new Vehicle();
        Vehicle minicar = new Vehicle();
        //define fariable
        int rang1;
        int rang2;
        //assecc data from my class
        minibus.passengers = 12 ;
        minibus.fuelcap = 60;
        minibus.mpg = 10;
        minicar.passengers = 5;
        minicar.fuelcap = 45;
        minicar.mpg = 13;
        //asigne value 
        rang1=minibus.fuelcap * minibus.mpg;
        rang2=minicar.fuelcap * minibus.mpg;
        //print
        System.out.println("Minibus can carry : " + minibus.passengers +" " +  "With the range of : " + rang1);
        System.out.println("Minnicar can carry : " + minicar.passengers +" " +  "With the rane of : " + rang2);
    }
}
