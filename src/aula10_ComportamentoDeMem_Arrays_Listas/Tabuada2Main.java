package aula10_ComportamentoDeMem_Arrays_Listas;

public class Tabuada2Main {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) { // linha
			System.out.println();
			for (int j = 1; j <= 10; j++) { // coluna
				if (i == j) {
					System.out.printf(" [%2d] ", i * j);
				} else {
					System.out.printf(" %2d ", i * j);
				}
			}
		}

	}
}
