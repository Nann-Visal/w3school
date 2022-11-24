//define class 
class Vehicle{
    int passengers;
    int fuelcap;
    int mpg;
    //create method
    void range(){
        System.out.println("Range is : " + fuelcap*mpg);
        return;
    }
}
public class DemoClassmethod {
    public static void main(String[] args){
        //define object for my class
        Vehicle minibus = new Vehicle();
        Vehicle minicar = new Vehicle();
        //assecc data from my class
        minibus.passengers = 12 ;
        minibus.fuelcap = 60;
        minibus.mpg = 10;
        minicar.passengers = 5;
        minicar.fuelcap = 45;
        minicar.mpg = 13;
        //print
        System.out.println("Minibus can carry : " + minibus.passengers);
        minibus.range();
        System.out.println("Minnicar can carry : " + minicar.passengers);
        minicar.range();
    }
}

//error
