public class DemoThrow {
    public static void main(String[] args){
        try{
            System.out.println("Before throw");
            throw new ArithmeticException();
        }catch (ArithmeticException exception){
            System.out.println("Exception caught");
        }
        System.out.println("After Try/catch block");
    }
}
