package Lab1.Visal1;

import java.util.Scanner;

/**
 * the class to modulo number
 */
public class modulonumber {
    public static void main(String[] args){
        int myNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number = ");
        myNumber=scanner.nextInt();
        if(myNumber%3==0&&myNumber%5==0){
            System.out.println("AB");
        }
        else if(myNumber%3==0){
            System.out.println("A");
        }
        else if(myNumber%5==0){
            System.out.println("B");
        }
    }
}
