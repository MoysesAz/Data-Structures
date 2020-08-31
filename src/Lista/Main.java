package Lista;


public class Main {

	public static void main(String[] args) {
		TADLista<Integer> lista = new Lista<Integer>(4);
		lista.add(5, 0);
		lista.showVetor();
		lista.add(4, 0);
		lista.showVetor();
		lista.add(3, 0);
		lista.showVetor();
		lista.add(2, 0);
		lista.showVetor();
		lista.add(1, 0);
		lista.showVetor();
		lista.add(0, 0);
		lista.showVetor();
		lista.removeElement(0);
		lista.showVetor();
		lista.removeElement(0);
		lista.showVetor();
		lista.removeElement(0);
		lista.showVetor();
		lista.removeElement(0);
		lista.showVetor();
		lista.removeElement(0);
		lista.showVetor();
	
	}

}
