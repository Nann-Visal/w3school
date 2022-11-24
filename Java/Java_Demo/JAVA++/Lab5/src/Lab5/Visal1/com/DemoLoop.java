package Lab5.Visal1.com;

public class DemoLoop {
    public static void main(String[] arg){
        int i,j;
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=1;i<=5;i++){
            for(j=(5-i);j>=1;j--){
                System.out.print(" ");//print space before
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
        System.out.println();
        }
    }
}
