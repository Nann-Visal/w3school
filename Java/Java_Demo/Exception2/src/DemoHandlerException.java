import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoHandlerException {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean cont = true;
        do{
            try {
                System.out.println("Please input an integer number");
                int num = scanner.nextInt();
                System.out.println("The number is " + num);
                cont = false;
            }catch (InputMismatchException exception){
                System.out.println("Try again sir!!!!!!! your input not integer");
                scanner.nextLine();
            }
        }while(cont);
    }
}
