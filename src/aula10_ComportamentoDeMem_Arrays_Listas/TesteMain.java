package aula10_ComportamentoDeMem_Arrays_Listas;

public class TesteMain {

	public static void main(String[] args) {
		String[] vect = new String[] {"Maria","Bob","Alex", "159"};
		for(int i=0;i<vect.length;i++){
			System.out.println(vect[i]);
		}
		System.out.println("Teste diferença");
		for(String obj:vect){
			System.out.println(obj);
		}
		int[] vectNumero = new int[]{1,9,2};
		for(int obj:vectNumero){
			System.out.print(obj+", ");
		}
	}

}
