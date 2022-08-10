package program;

/*
beecrowd | 1096 - Sequencia IJ 2

Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

Entrada
Não há nenhuma entrada neste problema.

Saída
Imprima a sequencia conforme exemplo abaixo
*/

public class Main {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 9; i+= 2) {
			for(int j = 7; j >= 5; j--) {
				System.out.printf("I=%d J=%d\n", i, j);
			}
		}
	}
}
