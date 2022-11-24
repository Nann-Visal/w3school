import java.util.Scanner;

public class DemoWhileLoopwithStatic {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int num = 2;
        String Iput;
        while(true){
            System.out.println(num+" ");
            System.out.println("Count Countinu?(N or n)");
            Iput = sc.nextLine();
            if(Iput.equalsIgnoreCase("N"))break;
            num +=1;
        }
        System.out.println("Close!!!!!!!!!!!!!!!!!!!!!!!!!11");
    }
}
    
