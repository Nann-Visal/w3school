public class DemoFinally {
    public static void main(String [] args){
        for(int i=0;i<3;i++){
            TestFinal.generateException(i);
            System.out.println();
        }
    }
}
