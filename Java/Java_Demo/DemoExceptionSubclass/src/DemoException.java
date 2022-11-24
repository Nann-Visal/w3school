public class DemoException {
    public static void main(String[] agr){
        int num[]={4,8,16,32,64,126,256};
        int denom[]={2,0,4,6,0,8};
        for(int i=0;i< num.length;i++){
            try{
                if((num[i]%2)!=0)throw new NonIntResultException(num[i],denom[i]);
                System.out.println(num[i]+"/"+denom[i]+"is"+num[i]/denom[i]);
            }catch (ArithmeticException exception){
                System.out.println("Can not divide by Zero!");
            }catch (ArrayIndexOutOfBoundsException exception){
                System.out.println("No match element found");
            }catch (NonIntResultException exception){
                System.out.println(exception);
            }
        }
    }
}
