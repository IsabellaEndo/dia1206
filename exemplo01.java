package matri1206;
import java.util.Scanner;
public class exemplo01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int m[][] = new int [3][3];

		//Entrada de dados 
		for(int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				m[i][j] = (int)Math.round(Math.random()*100);
			}
		}
		//saida de dados 
		for(int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.println("os valores sao"+ m[1][j]);
			}
		}
		ler.close();
	}

}
