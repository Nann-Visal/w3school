import java.util.Scanner;

public class DemoForLoop {
    public static void main(String [] args){
       int m,n,i;
       Scanner input = new Scanner(System.in);
       System.out.print("Enter i = ");
       i = input.nextInt();
       System.out.print("Enter m = ");
       m = input.nextInt();
       System.out.print("Enter n = ");
       n = input.nextInt();
       input.close();
       // for loop 
       for(i=n;i<m;i++){
           if(i%2==0){
               System.out.print(i+" " );
           }
       }
    }
}
