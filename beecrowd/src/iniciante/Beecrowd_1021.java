package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1021 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double totalReais = sc.nextDouble();
		double centavos;
		
		System.out.println("NOTAS:");
		int notasDe100 = (int)totalReais / 100;
		centavos = totalReais % 100;
		System.out.println(notasDe100 + " nota(s) de R$ 100.00");
		
		int notasDe50 = (int)centavos / 50;
		centavos = centavos % 50;
		System.out.println(notasDe50+ " nota(s) de R$ 50.00");
		
		int notasDe20 = (int)centavos / 20;
		centavos = centavos % 20;
		System.out.println(notasDe20+ " nota(s) de R$ 20.00");
		
		int notasDe10 = (int)centavos / 10;
		centavos = centavos % 10;
		System.out.println(notasDe10+ " nota(s) de R$ 10.00");
		
		int notasDe5 = (int)centavos / 5;
		centavos = centavos % 5;
		System.out.println(notasDe5+ " nota(s) de R$ 5.00");
		
		int notasDe2 = (int)centavos / 2;
		centavos = centavos % 2;
		System.out.println(notasDe2+ " nota(s) de R$ 2.00");
		
		System.out.println("MOEDAS:");
		
		int moedaDe1 = (int)centavos / 1;
		centavos = centavos % 1;
		System.out.println(moedaDe1+ " moeda(s) de R$ 1.00");
		
		int moedaDe50 =  (int)(centavos / 0.5);
		centavos = centavos % 0.5;
		System.out.println(moedaDe50+ " moeda(s) de R$ 0.50");
		
		int moedaDe25 = (int)(centavos / 0.25);
		centavos = centavos % 0.25;
		System.out.println(moedaDe25+ " moeda(s) de R$ 0.25");
		
		int moedaDe10 = (int)(centavos / 0.1);
		centavos = centavos % 0.1;
		System.out.println(moedaDe10+ " moeda(s) de R$ 0.10");
		
		int moedaDe5 = (int)(centavos / 0.05);
		centavos = centavos % 0.05;
		System.out.println(moedaDe5+ " moeda(s) de R$ 0.05");
		
		centavos = centavos / 0.01;
		System.out.println((int)centavos+ " moeda(s) de R$ 0.01");
		
		
		sc.close();

	}

}
