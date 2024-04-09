package tp2.ejercicio1;

import java.util.LinkedList;
import java.util.Queue;
import ejercicio8.Queue;

public class BinaryTree <T> {
	
	private T data;
	private BinaryTree<T> leftChild;   
	private BinaryTree<T> rightChild; 

	
	public BinaryTree() {
		super();
	}

	public BinaryTree(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	/**
	 * Preguntar antes de invocar si hasLeftChild()
	 * @return
	 */
	public BinaryTree<T> getLeftChild() {
		return leftChild;
	}
	/**
	 * Preguntar antes de invocar si hasRightChild()
	 * @return
	 */
	public BinaryTree<T> getRightChild() {
		return this.rightChild;
	}

	public void addLeftChild(BinaryTree<T> child) {
		this.leftChild = child;
	}

	public void addRightChild(BinaryTree<T> child) {
		this.rightChild = child;
	}

	public void removeLeftChild() {
		this.leftChild = null;
	}

	public void removeRightChild() {
		this.rightChild = null;
	}

	public boolean isEmpty(){
		return (this.isLeaf() && this.getData() == null);
	}

	public boolean isLeaf() {
		return (!this.hasLeftChild() && !this.hasRightChild());

	}
		
	public boolean hasLeftChild() {
		return this.leftChild!=null;
	}

	public boolean hasRightChild() {
		return this.rightChild!=null;
	}
	@Override
	public String toString() {
		return this.getData().toString();
	}

	public  int contarHojas() {
		int leftCount = 0;
		int rightCount = 0;
		if(this.isEmpty())
			return 0;
		else 
			if(this.isLeaf())
				return 1;
			else {
				if(this.hasLeftChild())
					leftCount = this.getLeftChild().contarHojas();
				if(this.hasRightChild())
					rightCount = this.getRightChild().contarHojas();
				return leftCount + rightCount;
			}
	}
		
		
    	 
    public BinaryTree<T> espejo(){
    	BinaryTree<T> abEspejo = new BinaryTree<T>(this.getData()); // con el getdata pongo la raiz en el espejo
    	
    	if(this.hasLeftChild())
    		abEspejo.addRightChild(this.getLeftChild().espejo());
    	if(this.hasRightChild())
    		abEspejo.addLeftChild(this.getRightChild().espejo());
 	   return abEspejo;
    }
    
	// 0<=n<=m
	public void entreNiveles(int n, int m){
		if (this.isEmpty() || n < 0 || m < n) return;
		Queue<BinaryTree<T>> cola = new LinkedList<>();
		cola.add(this);
		
		int nivelActual = 0;
		
		while(!cola.isEmpty()) {
			int nivel = cola.size();
			if(nivelActual >=n && nivelActual <= m) {
				for(int i=0; i<nivel; i++) {
					BinaryTree<T> nodo = cola.remove();
					System.out.print(nodo.getData() + " | ");
					if(nodo.hasLeftChild())
						cola.add(nodo.getLeftChild());
					if(nodo.hasRightChild());
						cola.add(nodo.getRightChild());
				}
			} else {
				for(int i= 0; i< nivel; i++) {
					cola.remove();
				}
			}
			nivelActual++;
		}
	}
	
}
