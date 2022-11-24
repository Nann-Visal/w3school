public class DemoOtherForLoop {
    public static void main(String[] args){
        for( int i=0 ; i<10 ;){
            System.out.println(" i = " + i);
            i +=1;
        }
        int i=0;
        int n=10;
        for( ;  ;){
            if(i<n){
                System.out.println(" i = " + i);
            }
            else{
                break;
            }
             i+=1;
        }
    }
}
