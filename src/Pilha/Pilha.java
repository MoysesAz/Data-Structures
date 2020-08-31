package Pilha;
class Pilha{
	private Integer[] vetor;
	private int pointer;
	
	public Pilha(int size) {
		this.vetor = new Integer[size];
		System.out.println("PILHA");

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
			vetor[pointer-1] = null;
			pointer -= 1;
		}
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
	
	
}