import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTable2 {
    public static void main(String[] arg){
        Hashtable balance = new Hashtable();
        String str;
        double bal;
        balance.put("VISUAL 1",new Double(1000.001));
        balance.put("VISUAL 2",new Double(1000.002));
        balance.put("VISUAL 3",new Double(1000.003));
        balance.put("VISUAL 4",new Double(1000.004));
        balance.put("VISUAL 5",new Double(1000.005));
        balance.put("VISUAL 6",new Double(1000.006));
        balance.put("VISUAL 7",new Double(1000.007));
        //show all balance in hash table
        Set set = balance.keySet();
        //get iterator
        Iterator itr= set.iterator();
        while(itr.hasNext()){
            str=(String)itr.next();
            System.out.println(str+"  :  "+balance.get(str));
        }
        System.out.println();
        //deposit 1111 into VISUAL 7 account
        bal=((Double)balance.get("VISUAL 7")).doubleValue();
        balance.put("VISUAL 7",new Double(bal+1111));
        System.out.println("VISUAL 7 new balance  :  "+balance.get("VISUAL 7"));
    }
}
