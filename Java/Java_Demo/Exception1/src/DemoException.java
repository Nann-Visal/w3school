public class DemoException {
    public static void main(String[] args){
        int num[] = new int[7];
        try{
            System.out.println("Before exception is generate");
            for(int i=0;i<9;i++){
                num[i]=i*2;
                System.out.println("num ["+i+"]= "+num[i]);
            }
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Hey Index out of Bound sir!!!!1");
        }
        System.out.println("After catch execute");
    }
}
