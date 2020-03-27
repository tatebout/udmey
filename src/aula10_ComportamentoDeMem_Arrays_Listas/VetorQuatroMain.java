package aula10_ComportamentoDeMem_Arrays_Listas;

import java.text.ParseException;
import java.util.Scanner;

import entities.VetorQuatro;

public class VetorQuatroMain {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		VetorQuatro[] vect = new VetorQuatro[10];
//		String deNovo;
		char deNovo;
		do {
			System.out.print("How many rooms will be rented?");
			int n = sc.nextInt();

			for (int i = 1; i <= n; i++) {
				System.out.println();
				System.out.println("Rent #" + i + ":");
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Email: ");
				String email = sc.next();
				System.out.print("Room: ");
				int room = sc.nextInt();
				vect[room] = new VetorQuatro(name, email);
			}
			System.out.println();
			System.out.println("Busy rooms:");
			for (int i = 0; i < 10; i++) {
				if (vect[i] != null) {
					System.out.println(i + ": " + vect[i]);
				}
			}
			System.out.println("Gostaria de novo? (s/n)");
//			deNovo = sc.next();
			deNovo = sc.next().charAt(0);
//		} while (deNovo == "s"); // String	
		} while (deNovo == 's'); // char
		sc.close();
	}
}