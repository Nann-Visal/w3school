public class TestFinal {
    public static void generateException(int gen){
        int t;
        int num[]=new int[2];
        System.out.println("Receiving "+ gen);
        try{
            switch(gen){
                case 0:
                    t=10;
                    break;
                case 1:
                    num[4]=4;
                    break;
                case 2:
                    return;
            }
        }catch (ArithmeticException exception){
            System.out.println("Can not divide by Zero");
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("No matching element found");
        }finally{
            System.out.println("Leaving try");
        }
    }
}
