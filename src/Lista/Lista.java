package Lista;

public class Lista<T> implements TADLista<T>{
	public T[] vetor;
	public int pointer = 0;
	
	@SuppressWarnings("unchecked")
	public Lista(int size) {
		vetor = (T[]) new Object[size];
		System.out.println("Lista");
	}
	
	public void showVetor(){
		System.out.print('[');
		System.out.print(' ');
		for(T value: vetor) {
			System.out.print(value);
			System.out.print(' ');
		}
		System.out.println(']');

	}
	
	public void add(T value, int index) {
		if(vetor[vetor.length - 1] != null) {
			System.out.println("Full Row");
		}
		else if(pointer == index) {
			vetor[index] = value;
			pointer += 1;
		}
		else {
			reloadAdd(index);
			vetor[index] = value;
			pointer += 1;
		}
	}
	
	
	private void reloadAdd(int index) {
		for(int i = pointer; i != index; i--) {
			vetor[i] = vetor[i-1];
		}
	}
	
	public void removeElement(int index) {
		if(pointer==0) {
			System.out.println("Empty Row");
		}
		else if(vetor[index] == null) {
			System.out.println("Empty Index");
		}
		else if(index == pointer - 1){
			vetor[index] = null;
			pointer -= 1;
		}
		else {
			vetor[index] = null;
			reloadRemove(index);
			vetor[pointer - 1] = null;
			pointer -= 1;
			
		}
		
	}
	
	private void reloadRemove(int index){
		for(int i = index; i != pointer - 1; i++) {
			vetor[i] = vetor[i+1];
		}
	}


}
