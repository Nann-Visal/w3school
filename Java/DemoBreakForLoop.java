public class DemoBreakForLoop {
    public static void main(String[] args){
        int n =100;
        int i=0;
        for(i=0 ; i<n ; i++){
            if(i==9){
                break;
            }
            System.out.println(i + " ");
        }
    }
}
