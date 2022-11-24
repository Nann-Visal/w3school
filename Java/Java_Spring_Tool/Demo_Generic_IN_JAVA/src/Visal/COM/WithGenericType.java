package Visal.COM;

//<T> we call parameter write 
public class WithGenericType<T> {
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	public static void main(String[] args) {
		WithGenericType<String> type = new WithGenericType<String>();
		type.setValue("BroThin");
		String st = type.getValue();
		System.out.println(st);

	}
}
