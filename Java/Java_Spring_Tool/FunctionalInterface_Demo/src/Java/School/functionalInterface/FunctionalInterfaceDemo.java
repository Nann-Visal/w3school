package Java.School.functionalInterface;

public class FunctionalInterfaceDemo {
	public static void main(String[] args) {
		AddNumber add_3 = new MyAddThree();
		Integer newNum = add_3.add(5);
		System.out.println(newNum);
		AddNumber add_10 = new AddNumber() {

			@Override
			public Integer add(int number) {
				// TODO Auto-generated method stub
				return number+10;
			}
			
		};
		System.out.println(add_10.add(8));
	}

}
