import java.util.Enumeration;
import java.util.Vector;

public class DemoVector {
    public static void main(String[] arg) {
        //initial size of vector is 3 and increment by 2
        Vector vector = new Vector(3, 2);
        System.out.println("Initial size  :  " + vector.size());
        vector.addElement(new Integer(1));
        vector.addElement(new Integer(2));
        vector.addElement(new Integer(3));
        vector.addElement(new Integer(4));
        System.out.println("Capacity after add 4 integer number  : " + vector.capacity());
        vector.addElement(new Double(4.5));
        System.out.println("Current capacity  :  " + vector.capacity());
        vector.addElement(new Double(6.08));
        vector.addElement(new Integer(9));
        System.out.println("Current capacity  :  " + vector.capacity());
        vector.addElement(new Float(9.4));
        vector.addElement(new Integer(11));
        System.out.println("Current capacity  :  " + vector.capacity());
        System.out.println("First Element     :  "+(Integer)vector.firstElement());
        System.out.println("Last Element      :  "+(Integer)vector.lastElement());
        if(vector.contains(new Integer(3))){
            System.out.println("Vector contains 3");
        }
        //enumerate the element in the vector
        Enumeration vEnum=vector.elements();
        System.out.println("\nElement in vector  :  ");
        while(vEnum.hasMoreElements()){
            System.out.print(vEnum.nextElement()+"");
            System.out.println();
        }
    }
}
