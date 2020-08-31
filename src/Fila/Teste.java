package Fila;


public class Main {

	public static void main(String[] args) {
		Fila fila = new Fila(4);
		fila.add(1);
		fila.showVetor();
		fila.add(2);
		fila.showVetor();
		fila.add(3);
		fila.showVetor();
		fila.add(4);
		fila.showVetor();
		fila.add(5);
		System.out.print(fila.pointer);
		fila.showVetor();
		fila.remove_element();
		fila.showVetor();
		fila.remove_element();
		fila.showVetor();
		fila.remove_element();
		fila.showVetor();
		fila.remove_element();
		fila.showVetor();
		fila.remove_element();
		fila.showVetor();
		fila.remove_element();
		fila.showVetor();

	}
}