package Visal.COM;

public class WithOutGenerciTpye {
	private Object value;
	public Object getValue() {
		return value;
		
	}
	public void setValue(Object value) {
		this.value=value;
	}
	public static void main(String[] arg) {
		WithOutGenerciTpye type = new WithOutGenerciTpye();
		type.setValue("Visal");
		String st = (String) type.getValue();
		System.out.println(st);
	}
}
