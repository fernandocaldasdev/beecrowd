package iniciante;

import java.util.Scanner;

public class Beecrowd_1020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
 		int quantidadeDias = sc.nextInt();
		int dias;
		
		int idadeAnos = quantidadeDias /365;
		dias = quantidadeDias % 365;
		
		int idadeMeses = dias / 30;
		dias = dias % 30;
		
		System.out.println(idadeAnos + " ano(s)");
		System.out.println(idadeMeses + " mes(es)");
		System.out.println(dias + " dia(s)");
		
		sc.close();
	}

}
