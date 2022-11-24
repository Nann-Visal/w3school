import java.util.Comparator;

public class TreeMapCom implements Comparator {

    @Override
    public int compare(Object obj1, Object obj2) {
        int i,j,k;
        String str1,str2;
        str1=(String)obj1;
        str2=(String)obj2;
        //find index of beginning of last name
        i=str1.lastIndexOf("");
        j=str2.lastIndexOf("");
        k=str1.substring(i).compareTo(str2.substring(j));
        if(k==0){//last name match, check entire name
            return str1.compareTo(str2);
        }else{
            return k;
        }
    }
}
