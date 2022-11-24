import java.util.Scanner;

public class DemoSwitchCase {
    public static void main(String[] args){
        int b;
        int year;
        int month;
        //user input
        Scanner input = new Scanner(System.in);
        System.out.print("Year = ");
        year = input.nextInt();
        System.out.print("month = ");
        month = input.nextInt();
        input.close();
        //set value of b
        if(year%4==0){
            b=1;
        }
        else{
            b=0;
        }
        //perform switch case
        switch(month){
            case 1:
                System.out.println("This: " + year + "\t" + "January has 31 day");
                break;
            case 2:
                if(b==1){
                    System.out.println("This: " + year + "February has 29 day");
                }
                else{
                    System.out.println("This: " + year + "February has 28 day");
                }
                break;
            case 3:
                System.out.println("This: " + year + "March has 31 day");
                break;
            case 4:
                System.out.println("This: " + year + "April has 30 day");
                break;
            case 5:
                System.out.println("This: " + year + "May has 31 day");
                break;
            case 6:
                System.out.println("This: " + year + "June has 30 day");
                break;
            case 7:
                System.out.println("This: " + year + "July has 31 day");
                break;
            case 8:
                System.out.println("This: " + year + "August has 31 day");
                break;
            case 9:
                System.out.println("This: " + year + "September has 30 day");
                break;
            case 10:
                System.out.println("This: " + year + "October has 31 day");
                break;
            case 11:
                System.out.println("This: " + year + "November has 30 day");
            case 12:
                System.out.println("This: " + year + "December has 31 day");
            default :
                System.out.println("Input invalid month(1-12");
        }
    }
}
