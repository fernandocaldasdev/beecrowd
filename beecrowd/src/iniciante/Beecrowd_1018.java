package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1018 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int totalReais =  sc.nextInt();
		
		
		int notas100 = totalReais / 100;
		int troco = totalReais % 100;
		
		int notas50 = troco / 50;
		troco = troco % 50;
		
		int notas20 = troco / 20;
		troco = troco % 20;
		
		int notas10 = troco / 10;
		troco = troco % 10;
		
		int notas5 = troco / 5;
		troco = troco % 5;

		int notas2 = troco / 2;
		troco = troco % 2;
		
		int notas1 = troco;
		
		
		
		System.out.println(totalReais);
		System.out.println(notas100+ " nota(s) de R$ 100,00");
		System.out.println(notas50 + " nota(s) de R$ 50,00");
		System.out.println(notas20+ " nota(s) de R$ 20,00");
		System.out.println(notas10+ " nota(s) de R$ 10,00");
		System.out.println(notas5+ " nota(s) de R$ 5,00");
		System.out.println(notas2+ " nota(s) de R$ 2,00");
		System.out.println(notas1+ " nota(s) de R$ 1,00");
		
     sc.close();
	}

}
