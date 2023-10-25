package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1036 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double r1;
		double r2;
		double delta = b * b - 4 * a * c;
		
		if(a == 0.0 || delta < 0.0) {
			System.out.println("Impossivel calcular");
		} else {
			r1 = (-b + Math.sqrt(delta))/ (2.0 * a);
			r2 = (-b - Math.sqrt(delta))/ (2.0 * a);
			System.out.printf("R1 = %.5f%n", r1);
			System.out.printf("R2 = %.5f%n",r2);
		}
		
		sc.close();
		
	}

}
