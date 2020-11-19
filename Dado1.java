package PacoteJava5;
import java.util.*;
public class Dado1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int [] valor = new int [10];
		int maiorValor = 0, contadorMaior=0;
		float media = 0, soma=0;
		
		for(int x=0; x<10; x++) {
			System.out.println("O dado foi lançado... Qual o valor que caiu?");
			valor [x] = ler.nextInt();
			
			soma = valor[x] + soma;
			
		if (valor[x] > maiorValor) {
			maiorValor = valor[x];
			}
		}
		for(int x=0; x<10; x++) {
		if (valor[x]==maiorValor) {
				contadorMaior++;
			}
		}
		System.out.println("A média dos 10 valores anotados do dado é: "+ soma/10+"\nO maior valor do dado foi:"+ maiorValor + "que se repetiu:" + contadorMaior);
	}
}
		


