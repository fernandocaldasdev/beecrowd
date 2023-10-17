package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1006 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		double peso1 = 2;
		double peso2 = 3;
		double peso3 = 5;
		
		double MEDIA = ( (A * peso1) + (B * peso2) + (C * peso3) ) / (peso1 + peso2 +peso3);
		
		System.out.printf("MEDIA = %.1f%n", MEDIA);
		
		sc.close();

	}

}
