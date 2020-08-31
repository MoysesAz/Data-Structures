package Fila;
public class Fila{
	public Integer[] vetor;
	public int pointer = 0;
	
	public Fila(int size) {
		this.vetor = new Integer[size];
		System.out.println("FILA");

	}
	
	public void showVetor(){
		System.out.print('[');
		System.out.print(' ');
		for(Integer value: vetor) {
			System.out.print(value);
			System.out.print(' ');
		}
		System.out.print(']');
		System.out.println();

	}
	
	public void add(int value) {
		if(pointer==vetor.length) {
			System.out.println("Full Row");
		}
		else {
			vetor[pointer] = value;
			pointer += 1;
		}
	}
	
	public void remove_element() {
		if(pointer==0) {
			System.out.println("Empty Row");
		}
		else {
			vetor[0] = null;
			reload();
			pointer -= 1;
		}
	}
	
	public void reload() {
		for(int i = 0; i != (pointer-1); i++){
			vetor[i] = vetor[i+1];
			}
		vetor[pointer-1]= null;
	}

}
