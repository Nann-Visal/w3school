package Lab6.Visal1.com;

import java.util.Scanner;

public class DemoEqua {
    public static void main(String[] args){
        //ax^2 + bx + c =0
        //delta= b^2 - 4ac
        //x=(-b+/-delta^0.5) / 2a
        double X1=0,X2=0;
        int a,b,c;
        float delta=0;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a=");
        a=scanner.nextInt();
        System.out.print("Enter b=");
        b=scanner.nextInt();
        System.out.print("Enter c=");
        c=scanner.nextInt();

        System.out.printf("%dX^2 + %dX + %d = 0\n",a,b,c);
        delta=(b*b)-4*(a*c);
        if(delta>0){
            X1 = ((-b)+(Math.pow(delta,0.5)))/2*a;
            X2 = ((-b)-(Math.pow(delta,0.5)))/2*a;
            System.out.println("X1 = "+ X1);
            System.out.println("X2 = "+ X2);
        }else if(delta<0){
            System.out.println("NULL!!!!!");
        }else if(delta==0){
            X1=X2=-b/(2*a);
            System.out.println("X1 = X2 = "+X1);
        }
    }
}
