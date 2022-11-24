import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] arg){
        //Create an array list
        ArrayList arrayList=new ArrayList();
        System.out.println("Initial size of array list  :  "+arrayList.size());
        //Add element to array list
        arrayList.add(new Integer(1));
        arrayList.add(new Integer(2));
        arrayList.add(new Integer(3));
        arrayList.add(new Integer(4));
        System.out.println("Content of array list  :  "+arrayList);
        //Get array
        Object ia[]=arrayList.toArray();
        int sum=0;
        //Sum the array
        for(int i=0;i<ia.length;i++){
            sum +=((Integer) ia[i]).intValue();
            System.out.println("Sum is  =  "+sum);
        }
    }
}
