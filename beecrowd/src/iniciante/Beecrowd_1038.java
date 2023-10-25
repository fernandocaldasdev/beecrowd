package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1038 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigoProduto = sc.nextInt();
		int quantidadeProduto = sc.nextInt();
		double valorTotal;

		switch (codigoProduto) {
		case 1:
			valorTotal = quantidadeProduto * 4.0;
			System.out.printf("Total: R$ %.2f%n", valorTotal);
			break;
		case 2:
			valorTotal = quantidadeProduto * 4.50;
			System.out.printf("Total: R$ %.2f%n", valorTotal);
			break;
		case 3:
			valorTotal = quantidadeProduto * 5.0;
			System.out.printf("Total: R$ %.2f%n", valorTotal);
			break;
		case 4:
			valorTotal = quantidadeProduto * 2.0;
			System.out.printf("Total: R$ %.2f%n", valorTotal);
			break;
		case 5:
			valorTotal = quantidadeProduto * 1.50;
			System.out.printf("Total: R$ %.2f%n", valorTotal);
			break;

		}

	}

}
