package tp2.ejercicio6;

import tp2.ejercicio1.BinaryTree;

public class Transformacion {
	private BinaryTree<Integer> arbol;
	
	public Transformacion(BinaryTree<Integer> unArbol) {
		this.arbol = unArbol;
	}
	
	public BinaryTree<Integer> getArbol() {
        return arbol;
    }
	
	
	public BinaryTree<Integer> suma(){
		suma(arbol);
		return arbol;
	}
	
	private int suma(BinaryTree<Integer> ar) {
		int s = 0;
		if(ar.isLeaf()) { // si es una hoja
			s = ar.getData(); //guardo en s el dato
			ar.setData(0); // pongo la hoja en 0
			return s; // vuelvo con el dato para sumar
		}
		
		if(ar.hasLeftChild()) { // si tiene hijo izquierdo
			s+= suma(ar.getLeftChild()); // entro recursivamente y sumo el resultado
		}
		
		if(ar.hasRightChild()) { // si tiene hijo derecho
			s+=suma(ar.getRightChild()); // entro recursivamente y sumo el resultado
		}
		
		int actual = ar.getData(); // en actual guardo el dato que estoy parado
		ar.setData(s); // pongo como dato de raiz lo que vengo sumando
		return actual + s; // vuelvo con la raiz mas la suma de los subarboles
	}
	
	
	
	public static void main(String[] args) {
		BinaryTree<Integer> ab = new BinaryTree<Integer>(1);
		
		BinaryTree<Integer> hijoIzquierdo = new BinaryTree<Integer>(2);
		
		BinaryTree<Integer> hijoDerecho = new BinaryTree<Integer>(3);
		
		hijoIzquierdo.addRightChild(new BinaryTree<Integer>(4));
		
		BinaryTree<Integer> nivel2DI = new BinaryTree<Integer>(5);
		nivel2DI.addLeftChild(new BinaryTree<Integer>(7));
		nivel2DI.addRightChild(new BinaryTree<Integer>(8));
		
		hijoDerecho.addLeftChild(nivel2DI);
		hijoDerecho.addRightChild(new BinaryTree<Integer>(6));
		
		ab.addLeftChild(hijoIzquierdo);
		ab.addRightChild(hijoDerecho);
		
		Transformacion trans = new Transformacion(ab);
		trans.suma();
		
		trans.getArbol().imprimirArbolPreOrden(ab);
	}

}

