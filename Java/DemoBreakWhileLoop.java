public class DemoBreakWhileLoop {
    public static void main(String[] args){
        int n=100;
        int i=0;
        while(i<n){
            if(i==9){
                break;
            }
            System.out.println(i + " ");
            i++;
        }
    }
}
