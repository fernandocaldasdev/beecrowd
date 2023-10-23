package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1017 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int horas = sc.nextInt();
		int velocidade = sc.nextInt();
		
		double distanciaPercorrida = horas * velocidade;
		
		double quantidadeDeLitros = distanciaPercorrida / 12;
		System.out.printf("%.3f%n",quantidadeDeLitros);
		
		sc.close();
	}

}
