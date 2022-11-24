import java.sql.Array;
import java.util.Arrays;

public class DemoArray {
    public static void main(String[] arg){
        int[] array=new int[10];
        for(int i=0; i<10; i++){
            array[i]=-5*i;
        }
        //display then sort and display again
        System.out.print("Original Contents  :  ");
        display(array);
        Arrays.sort(array);
        System.out.print("Sorted  :  ");
        display(array);
        //fill and display
        Arrays.fill(array,2,6,-1);
        System.out.print("After fill()  :  ");
        display(array);
        //sort and display
        Arrays.sort(array);
        System.out.print("After sort again  :  ");
        display(array);
        //binary for search -15
        System.out.print("the value -15 is location  :  ");
        int index=Arrays.binarySearch(array,-15);
        System.out.println(index);
    }
    private static void display(int[] array) {
        for(int i=0;i< array.length;i++){
            System.out.print(array[i]+"");
            System.out.println();
        }
    }
}
