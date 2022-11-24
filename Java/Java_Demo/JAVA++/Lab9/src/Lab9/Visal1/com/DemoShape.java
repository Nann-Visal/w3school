package Lab9.Visal1.com;

public class DemoShape {
    public static void main(String[] args){
        int i,j;
        for(i=1;i<=5;i++){
            for(j=5;j>i;j--){
                System.out.print(" ");
            }
            for(int p=1;p<=(i*2)-1;p++){
                System.out.print("*");
            }
            System.out.println();
        }
        //////////////////////////
        for(i=4;i>=1;i--){
            for(j=4;j>=i;j--){
                System.out.print(" ");
            }
            for (int p=1;p<=(i * 2) -1;p++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
