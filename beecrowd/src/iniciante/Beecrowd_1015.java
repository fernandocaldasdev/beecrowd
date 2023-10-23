package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1015 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		double z  = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);
		
		double distancia = Math.sqrt(z);
		
		System.out.printf("%.4f%n",distancia);

	}

}
