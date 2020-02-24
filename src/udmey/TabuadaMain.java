package udmey;
public class TabuadaMain{
	public static void main(String[] args) {
		int i, j;
		for(i = 1; i <= 10; i++){ // Linha
			System.out.println(" ");
			for (j = 1; j <= 10; j++) { // Coluna
				System.out.printf("%2d ",j*i);
			}
		}
	}
}