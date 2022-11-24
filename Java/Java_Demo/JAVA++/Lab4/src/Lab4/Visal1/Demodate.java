package Lab4.Visal1;

import java.util.Scanner;

public class Demodate {
    public static void main(String[] args) {
        int  year , month , day=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Month : ");
        month = scanner.nextInt();
        System.out.print("Enter Year : ");
        year = scanner.nextInt();
        switch (month){
            case 1:
                day=31;
                break;
            case 2:
                if(year % 4 == 0) {
                    day = 29;
                    break;
                }else {
                    day = 28;
                    break;
                }
            case 3: case 5: case 7: case 8: case 10: case 12:
                day=31;
                break;
            case 4: case 6: case 9: case 11:
                day=30;
                break;
            default:
                System.out.println("Invalid!!!!!!!!!!!!!!!!!!!!!!!");
                break;
        }
        System.out.println("This month : "+month+" has "+day+"days");
    }
}