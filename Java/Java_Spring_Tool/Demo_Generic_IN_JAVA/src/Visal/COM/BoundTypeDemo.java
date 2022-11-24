package Visal.COM;

import java.util.List;

public class BoundTypeDemo {
	public static <T extends Number> double sum(List<T> numbers) {
		double total = 0;
		for(T num : numbers) {
			total +=num.doubleValue();
		}
		return total;
	}
	
	//main function
    public static void main(String[] arg) {
    	List<Integer> numbers = List.of(1,2,3,4);
    	double total = sum(numbers);
    	System.out.println(total);
    	
    	List<Long> numberss = List.of(1L,2L,3L);
    	double totalss = sum(numberss);
    	System.out.println(totalss);
    }

}
