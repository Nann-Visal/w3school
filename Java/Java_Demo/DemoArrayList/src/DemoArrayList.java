import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] arg){
        //Create an array list
        ArrayList arrayList=new ArrayList();
        System.out.println("Initial size of al  :  "+arrayList.size());
        //Add element to array list
        arrayList.add("C");
        arrayList.add("A");
        arrayList.add("M");
        arrayList.add("B");
        arrayList.add("O");
        arrayList.add("D");
        arrayList.add("I");
        arrayList.add("A");
        arrayList.add(0,"C1");
        System.out.println("Size of all after add Element  :  "+arrayList.size());
        //Display the array list
        System.out.println("Content of arraylist  :  "+arrayList);
        //To remove elements of from array list
        arrayList.remove("C1");
        arrayList.remove(0);
        System.out.println("Size of array list after delete  :  "+arrayList.size());
        System.out.println("Content of array list  :  "+arrayList);
    }
}
