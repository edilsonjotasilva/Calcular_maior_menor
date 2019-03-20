package exercicio_github;
import java.util.Random;
import java.util.Scanner;
/*faça um programa que cria uma matriz 10x10, calcule
o maior e o menor numero de determinada linha e 
determinada coluna de acordo com a opção do usuario
*/
public class Calcular {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int[][]M = new int[10][10];
		int cont = 0;
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				M[i][j] = r.nextInt(100);
				System.out.printf("%4d",M[i][j]);
			}
			cont++;			
			System.out.println("- Linha "+cont+", indice "+(cont-1));
			
			System.out.println();							
		}
		cont =0;
		for (int i = 0; i < 10; i++) {
			
			System.out.printf("%4s","|");
		}		
		System.out.println("");
		cont++;
		//MOSTRA O NUMERO DA COLUNA
		for (int i = 0; i < M.length; i++) {
			
			System.out.printf("%4d",cont++);
		}
		System.out.print(" ----> numero das Colunas");
		System.out.println();
		//MOSTRA O INDICE DA COLUNA
		cont  =0;
		for (int i = 0; i < M.length; i++) {			
			System.out.printf("%4d",cont++);
		}		
		System.out.print(" ----> Indice das Colunas");
		//MOSTRA O MAIOR E MENOR NUMERO DA LINHA
		System.out.println("\nDigite o numero da Linha: ");
		int numL = sc.nextInt();
		int maiorL = M[numL-1][0];
		int menorL = M[numL-1][0];
		for (int i = 0; i < M[numL-1].length; i++) {
			if(M[numL-1][i]>maiorL) {
				maiorL = M[numL-1][i];
			}if(M[numL-1][i]<menorL) {
				menorL = M[numL-1][i];
			}
		}
		//MOSTRA O MAIOR E MENOR NUMERO DA COLUNA
		System.out.println("\nDigite o numero da Coluna: ");
		int numC = sc.nextInt();
		int maiorC = M[0][numC-1];
		int menorC = M[0][numC-1];
		for (int i = 0; i < M[numC-1].length; i++) {
			if(M[i][numC-1]> maiorC) {
				maiorC = M[i][numC-1];
			}if(M[i][numC-1]< menorC) {
				menorC = M[i][numC-1];
			}
		}

		System.out.println();
		System.out.println("\nO Maior Numero da linha"+ numL+" é "+maiorL);
		System.out.println("O Menor Numero da alinha"+ numL+ " é "+menorL);
		System.out.println("\nO Maior Numero da Coluna"+ numC+" é "+maiorC);
		System.out.println("O Menor Numero da Coluna"+ numC+" é "+menorC);
		
		sc.close();
	}
}
