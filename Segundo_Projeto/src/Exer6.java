import java.util.Locale;
import java.util.Scanner;

public class Exer6 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double A, B, C;

		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		double areaTri = (A * C) / 2; 
		double areaC = 3.14159 * Math.pow(C, 2);
		double areaTra = ((A + B) * C) / 2;
		double areaQ = Math.pow(B, 2);
		double areaR = A * B; 
		System.out.printf("Triangulo:%.3f\n Circulo:%.3f\n Trapezio:%.3f\n Quadrado:%.3f\n Retangulo:%.3f\n", areaTri, areaC, areaTra, areaQ, areaR);
		sc.close();

	}
}
