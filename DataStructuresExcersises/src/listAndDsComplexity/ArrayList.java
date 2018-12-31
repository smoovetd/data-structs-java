package listAndDsComplexity;

public class ArrayList<T> {
	private T[] elements;
	
	private int crntIndex;
	
	private static final int initialCapacity = 2;
	
	public ArrayList(){
		this.elements = (T[]) new Object[initialCapacity];
		this.crntIndex = 0;
	}
	
	public int count() {
		return this.crntIndex;
	}
	
	public void add(T element) {
		if(this.crntIndex >= this.elements.length) {
			doubleLenght();
		}
		
		this.elements[this.crntIndex] = element;
		this.crntIndex++;
	}
	
	private void doubleLenght() {
		T[] oldElements = (T[]) new Object [this.elements.length];
		for(int i = 0; i < oldElements.length; i++) {
			oldElements[i] = this.elements[i];
		}
		
		this.elements = (T[]) new Object [this.elements.length * 2];
		
		for(int i = 0; i < oldElements.length; i++) {
			this.elements[i] = oldElements[i];
		}
	}
	
	public T getElementAtIndex(int index) throws Exception{
		if(index>this.count() - 1) {
			throw new Exception("No element at position: " + index);
		}
		
		return this.elements[index];
	}
	
	public T removeAt(int index) throws Exception {
		T crntEl = null;
		
		if(index>this.count() - 1) {
			throw new Exception("No element at position: " + index);
		}
		
		crntEl = this.getElementAtIndex(index);
		
		for (int i = index; i < this.count() - 1; i++) {
			this.elements[i] = this.elements[i+1];
		}
		
		this.crntIndex--;
		return crntEl;
	}
	
	@Override
	public String toString() {
		String result ="";
		
		for(int i = 0; i < this.count(); i++) {
			result = result + " " + this.elements[i] + " ";
		}
		
		return result;
	}
	
}
