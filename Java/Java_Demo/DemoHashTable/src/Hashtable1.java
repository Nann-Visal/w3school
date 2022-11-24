import java.util.Enumeration;
import java.util.Hashtable;

public class Hashtable1 {
    public static void main(String[] arg){
        Hashtable balance=new Hashtable();
        Enumeration names;
        String str;
        double bal;
        balance.put("VISUAL 1",new Double(3000.001));
        balance.put("VISUAL 2",new Double(3000.002));
        balance.put("VISUAL 3",new Double(3000.003));
        balance.put("VISUAL 4",new Double(3000.004));
        balance.put("VISUAL 5",new Double(3000.005));
        balance.put("VISUAL 6",new Double(3000.006));
        balance.put("VISUAL 7",new Double(3000.007));
        //show all balance in hash table
        names=balance.keys();
        while(names.hasMoreElements()){
            str=(String)names.nextElement();
            System.out.println(str+"  :  "+balance.get(str));
        }
        System.out.println();
        //deposit 1111 into VISUAL 7 account
        bal=((Double)balance.get("VISUAL 7")).doubleValue();
        balance.put("VISUAL 7",new Double(bal+1111));
        System.out.println("VISUAL 7 new balance  :  "+balance.get("VISUAL 7"));
    }
}
