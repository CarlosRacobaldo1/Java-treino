import java.util.Scanner;

public class Exer3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x, y;
		

		x = sc.nextInt();
		y = sc.nextInt();
		
		if(x % y == 0 || y % x == 0) {
			System.out.println("Multiplos");
		}
		else {
			System.out.println("Nao multiplos");
		}
		sc.close();

	}
}
