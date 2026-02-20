package view;

import java.util.Scanner;
import controller.FatorialController;

public class Principal {

	public static void main(String[] args) {
		FatorialController fat = new FatorialController();
		Scanner leia = new Scanner(System.in);
		
		String reset = "\u001B[0m";
		String verde = "\u001B[32m";
		
		int n = 0;
		
		while (n > 12 || n <= 0) {
			System.out.println("Digite um número entre 1 e 12: ");
			n = leia.nextInt();
			
			if(n > 12 || n <= 0) {
				System.out.println("Número inválido! Digite novamente!\n");
			}
		}
		
		int res = fat.fatorial(n);
		
		System.out.println("Fatorial de "+n+" : "+verde+res+reset);
		
		leia.close();
		
	}

}
