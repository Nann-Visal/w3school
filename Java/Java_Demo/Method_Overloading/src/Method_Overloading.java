public class Method_Overloading {
    public static void main(String [] args){
        Overload object = new Overload();
        System.out.println(object.sum(10,10));
        System.out.println(object.sum(10,10,10));
        System.out.println(object.sum(10.0,10));
        System.out.println(object.sum(10,15));
        System.out.println(object.sum(10.000,10));
    }
}
