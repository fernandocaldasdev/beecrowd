package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1009 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nomeFuncionario = sc.next();
		double salarioFixo = sc.nextDouble();
		double totalVendas = sc.nextDouble();
		double comissao = 0.15;
		
		double TOTAL = salarioFixo + (totalVendas * comissao);
		
		System.out.printf("TOTAL = %.2f%n", TOTAL);
		

	}

}
