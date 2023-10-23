package iniciante;

import java.util.Scanner;



public class Beecrowd_1019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tempoEmSegundos = sc.nextInt();
		int resto;
		
		int horas = tempoEmSegundos / 3600;
		resto = tempoEmSegundos % 3600;
		
		int minutos = resto / 60;
		resto = resto % 60;
		 
		System.out.println(horas + ":"+ minutos + ":" + resto);
		
		
		sc.close();
	}

}
