package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1040 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double nota3 = sc.nextDouble();
		double nota4 = sc.nextDouble();

		double media = (nota1 * 2.0 + nota2 * 3.0 + nota3 * 4.0 + nota4 * 1.0) / (2.0 + 3.0 + 4.0 + 1.0);

		if (media >= 7.0) {
			System.out.printf("Media: %.1f%n", media);
			System.out.println("Aluno aprovado.");
		} else if (media < 5.0) {

			System.out.printf("Media: %.1f%n", media);
			System.out.println("Aluno reprovado.");
		} else {

				
				double notaExame = sc.nextDouble();
				
				double mediaFinal = (media + notaExame) / 2.0;
				System.out.printf("Media: %.1f%n", media);
				System.out.println("Aluno em exame.");
				System.out.printf("Nota do exame: %.1f%n", notaExame);
				System.out.println("Aluno aprovado.");
				System.out.printf("Media final: %.1f%n", mediaFinal);

			
		}

	}

}
