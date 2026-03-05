import java.util.Locale;

public class Program {
	
	public static void main (String[] args) {
		String product1 = "Computer";
		String product2 = "Office Desk";
		int age = 32;
		int code = 5290;
		char gender = 'F';
		
		double price1 =2100;
		double price2 = 650.50;
		double measure = 53.364567890976;
		
		System.out.printf("Products:\n %s, which price is %f\n %s which price is %f\n", product1, price1, product2, price2);
		System.out.printf("Records: %d years old, code %d and gender: %s\n", age, code, gender);
		
		System.out.printf("Measure with 8 decimals %.8f\n", measure);
		System.out.printf("Measure with 3 decimals %.3f\n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("Measure with US standard %.4f\n", measure);
		
	}
}
