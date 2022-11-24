import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class DemoTreeMap {
    public static void main(String[] arg){
        //create tree map
        TreeMap tm=new TreeMap(new TreeMapCom());
        //put element to the map
        tm.put("VISUAL 1",new Double(3456.43));
        tm.put("VISUAL 2",new Double(3457.43));
        tm.put("VISUAL 3",new Double(3458.43));
        tm.put("VISUAL 4",new Double(3459.43));
        tm.put("VISUAL 5",new Double(3460.43));
        tm.put("VISUAL 6",new Double(3461.43));
        tm.put("VISUAL 7",new Double(3462.43));
        //get a set of the entire
        Set set=tm.entrySet();
        //get an iterator
        Iterator itr=set.iterator();
        //display elements
        while(itr.hasNext()){
            Map.Entry me=(Map.Entry)itr.next();
            System.out.print(me.getKey()+" : ");
            System.out.println(me.getValue());
        }
        System.out.println();
        //deposit 1111 into VISUAL 7  account
        double balance=((Double)tm.get("VISUAL 7")).doubleValue();
        tm.put("VISUAL 7",new Double(balance)+1111);
        System.out.println("VISUAL 7's new balance "+tm.get("VISUAL 7"));
    }
}
