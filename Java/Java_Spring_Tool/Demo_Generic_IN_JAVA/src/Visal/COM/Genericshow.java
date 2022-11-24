package Visal.COM;

import java.util.ArrayList;
import java.util.List;

public class Genericshow {
    public static void main(String[] arg) {
    	List <String> list = new ArrayList<String>();
    	list.add("School");
    	for(String obj : list){
    		System.out.println(" "+obj);
    	}
    }
}
