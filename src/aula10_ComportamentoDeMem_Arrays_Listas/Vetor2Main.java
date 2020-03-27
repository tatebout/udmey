package aula10_ComportamentoDeMem_Arrays_Listas;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Vetor2Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		double price;
		for(int i=0; i<vect.length; i++){
			sc.nextLine();
			String name = sc.nextLine();
			price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		double sum = 0.0;
		for(int i=0; i<vect.length;i++){
			sum+=vect[i].getPrice();
		}
		double avg = sum/vect.length;
		System.out.println("AVERAGE PRICE = "+avg);
		
		sc.close();
	}
}