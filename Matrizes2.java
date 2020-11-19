package PacoteJava5;
import java.util.*;
public class Matrizes2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int [][] n1 = new int [4][6];
		int [][] n2 = new int [4][6];
		int [][] m1 = new int [4][6];
		int [][] m2 = new int [4][6];
		int l,c,a,b, soma;

		for(l=0;l<4;l++){
			for(c=0;c<6;c++){
			System.out.println("Digite um número para N1: " );
			n1[l][c] = ler.nextInt();
			System.out.println("Digite um número para N2: ");
			n2[l][c] = ler.nextInt();

			}
			}
			for(l=0;l<4;l++){
				for(c=0;c<6;c++){
					m1[l][c] = n1[l][c]+n2[l][c];
					m2[l][c] = n1[l][c]-n2[l][c];
					System.out.println(m1[l][c]);
					System.out.println(m2[l][c]);
				}
			}
			

		}
}



