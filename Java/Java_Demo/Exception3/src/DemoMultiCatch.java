public class DemoMultiCatch {
    public static void main(String [] ags){
        int num[] ={4,8,16,32,64,128};
        int divide[] ={2,0,5,0,8};
        for(int i=0;i< num.length;i++){
            try{
                System.out.println(num[i]+ " / "+divide[i]+"="+num[i]/num[i]);
            }catch (ArithmeticException exception){
                System.out.println("Can not divide by Zero");
            }catch (ArrayIndexOutOfBoundsException exception){
                System.out.println("no match element found!!!!!!!!!!!!!!");
            }
        }
    }
}
