package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1008 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numeroFuncionario = sc.nextInt();
		int horasTrabalhadas = sc.nextInt();
		
		double valorHora = sc.nextDouble();
		
		double salarioFinal = horasTrabalhadas * valorHora;
		
		System.out.println("NUMBER = " + numeroFuncionario);
		System.out.printf("SALARY = U$ %.2f%n", salarioFinal);
	}

}
