package Lab7.Visal1.com;

import java.util.Scanner;

public class MaxDemo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a = ");
        int a=scanner.nextInt();
        System.out.print("Enter b = ");
        int b=scanner.nextInt();
        System.out.print("Enter c = ");
        int c=scanner.nextInt();
        if(a>b&&b>c){
            System.out.printf(" %d , %d , %d",c,b,a);
        }else if(b>a&&a>c){
            System.out.printf(" %d , %d , %d",c,a,b);
        }else if(c>a&&a>b){
            System.out.printf(" %d , %d , %d",b,a,c);
        }else if(c>b&&b>a){
            System.out.printf(" %d , %d , %d",a,b,c);
        }else if(a>c&&c>b){
            System.out.printf(" %d , %d , %d",b,c,a);
        }else if(b>c&&c>a){
            System.out.printf(" %d , %d , %d",a,c,b);
        }
    }
}
