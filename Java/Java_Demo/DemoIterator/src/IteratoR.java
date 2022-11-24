import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratoR {
    public static void main(String[] arg){
        //Create array list
        ArrayList al=new ArrayList();
        //Add element to array list
        al.add("C");
        al.add("A");
        al.add("M");
        al.add("B");
        al.add("O");
        al.add("D");
        al.add("I");
        al.add("A");
        //Use iterator to display content of array list
        System.out.print("Original content of al  : ");
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            Object element =itr.next();
            System.out.print(element+"");
        }
        System.out.println("");
        //modify Obj being iterated
        ListIterator Iitr=al.listIterator();
        while (Iitr.hasNext()){
            Object element=Iitr.next();
            Iitr.set(element+"+");
        }
        System.out.print("Modifies content of al  :  ");
        itr=al.iterator();
        while(itr.hasNext()){
            Object element =itr.next();
            System.out.print(element+"");
        }
        System.out.println("");
        //Now display the list backwards
        System.out.print("Modifies content of al  :  ");
        while(Iitr.hasPrevious()){
            Object element =Iitr.previous();
            System.out.print(element+"");
        }
        System.out.println("");
    }
}
