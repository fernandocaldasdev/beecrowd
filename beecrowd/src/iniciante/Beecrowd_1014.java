package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1014 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double km = sc.nextDouble();
		double combustivelGasto = sc.nextDouble();
		
		double consumoMedio = km / combustivelGasto;
		
		System.out.printf("%.3f km/l%n", consumoMedio);

	}

}
