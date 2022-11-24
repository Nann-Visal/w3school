package Visal.COM;

import java.util.ArrayList;
import java.util.List;

public class GeneriMethod {
	public static <T> boolean isEqual(WithGenericType<T> t1,WithGenericType<T> t2) {
		return t1.getValue().equals(t2.getValue());
	}
	public static <T> List<T> combine(List<T> list1,List<T> list2){
		List<T> result = new ArrayList<>();
		result.addAll(list1);
		result.addAll(list2);
		return result;
	}
	public static void main(String[] agr) {
//		WithGenericType<Integer> t1 = new WithGenericType<>();
//		t1.setValue(5);
//		WithGenericType<Integer> t2 = new WithGenericType<>();
//		t2.setValue(6);
//		
//		boolean test = GeneriMethod.isEqual(t1,t2);
//		System.out.println(test);
		
		List<String> List1 = new ArrayList<String>();
		List1.add("Test1");
		List1.add("Test2");
		
		List<String> List2 = new ArrayList<String>();
		List2.add("Test3");
		List2.add("Test4");
		
		List<String> result = combine(List1,List2);
		System.out.println(result);
	}
}
