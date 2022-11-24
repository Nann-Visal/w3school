public class DemoTryInTry {
    public static void main(String[] args){
        int num[]={4,8,16,32,64,128};
        int divide[]={2,0,5,0,8};
        try{
            for(int i=0;i< num.length;i++){
                try{
                    System.out.println(num[i]+" / "+divide[i]+"="+num[i]/divide[i]);
                }catch (ArithmeticException exception){
                    System.out.println("Can not divide by Zero");
                }
            }
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("No match element bound!!!!!!!!!!!");
        }
    }
}
