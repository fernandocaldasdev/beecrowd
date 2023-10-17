package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1010 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int codPeca = sc.nextInt();
		int numeroPeca = sc.nextInt();
		double valorPeca = sc.nextDouble();
		int codPeca2 = sc.nextInt();
		int numeroPeca2 = sc.nextInt();
		double valorPeca2 = sc.nextDouble();
		
		double valorAPagar = (numeroPeca * valorPeca) + (numeroPeca2 * valorPeca2);
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorAPagar);
		
		sc.close();
	}

}
