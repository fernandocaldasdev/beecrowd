package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1005 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc .nextDouble();
		double peso1 = 3.5;
		double peso2 = 7.5;
		
		double MEDIA = ((A * peso1) + (B * peso2)) / (peso1 +peso2); 
		
		System.out.printf("MEDIA = %.5f%n", MEDIA);

	}

}
