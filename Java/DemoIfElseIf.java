import java.util.Scanner;
public class DemoIfElseIf {
    public static void main(String[] agr){
        int  b;//to check years modulus 4 equal 0
        int year;//store year input
        int month;//store month input
        //user input 
        Scanner input = new Scanner(System.in);
        System.out.print("Year=");
        year = input.nextInt();
        System.out.print("Month=");
        month = input.nextInt();
        input.close();
        if(year%4==0)
        {
            b=1;
        }
        else
        {
            b=0;
        }
        if(month==1)
        {
            System.out.println("this Year:"+year+ "January has 31 days" );
        }
        else if(month==2)
        {
            if(b==1)
            {
                System.out.println("this Year:"+year+ "February has 29 days" );
            }
            else
            {
                System.out.println("this Year:"+year+ "February has 28 days" );
            }
        }
        else if(month==3)
        {
            System.out.println("this Year:"+year+ "March has 31 days" );
        }
        else if(month==4)
        {
            System.out.println("this Year:"+year+ "April has 30 days" );
        }
        else if(month==5)
        {
            System.out.println("this Year:"+year+ "May has 31 days" );
        }
        else if(month==6)
        {
            System.out.println("this Year:"+year+ "June has 30 days" );
        }
        else if(month==7)
        {
            System.out.println("this Year:"+year+ "July has 31 days" );
        }
        else if(month==8)
        {
            System.out.println("this Year:"+year+ "August has 31 days" );
        }
        else if(month==9)
        {
            System.out.println("this Year:"+year+ "September has 30 days" );
        }
        else if(month==10)
        {
            System.out.println("this Year:"+year+ "October has 31 days" );
        }
        else if(month==11)
        {
            System.out.println("this Year:"+year+ "November has 30 days" );
        }
        else if(month==12)
        {
            System.out.println("this Year:"+year+ "December has 31 days" );
        }
        else
        {
            System.out.println("Input invalid month (1-12");
        }
    }
}
