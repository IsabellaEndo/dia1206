package matri1206;

public class atividade03 {

	public static void main(String[] args) {

		int[][] mA = new int [3][3];
		int[][] mB = new int [3][3];
		int[][] mC = new int [3][3];



		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				mA[i][j] = (int)Math.round(Math.random()*100);
				mB[i][j] = (int)Math.round(Math.random()*100);
				mC[i][j] += mA[i][j]* mB[i][j];

			}
			
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("["+ mA[i][j]+"]");

			}
			System.out.println("\n--------------");
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("["+ mB[i][j]+"]");
			}	
			System.out.println("\n--------------");
		}
		
	}

	}

