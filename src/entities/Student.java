package entities;

public class Student {
	public String name;
	public double primeiroT;
	public double segundoT;
	public double terceiroT;

	public double notaFinal() {
		return primeiroT + segundoT + terceiroT;
	}

	public double mediaFinal() {
		if (notaFinal() < 60) {
			return 60.0 - notaFinal();
		} else {
			return 0.0;
		}
	}
}
