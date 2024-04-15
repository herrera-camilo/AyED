package tp2.ejercicio4;

import tp2.ejercicio1.BinaryTree;
import tp2.ejercicio1.main;

import java.util.*;

public class RedBinariaLlena {
	private BinaryTree<Integer> arbol;
	
	public RedBinariaLlena(BinaryTree<Integer> unArbolLLeno) {
		this.arbol = unArbolLLeno;
	}
	
	public int retardoReenvio(BinaryTree<Integer> a) {
		int hijoI = 0;
		int hijoD = 0;
		
		if(a.hasLeftChild()) {
			hijoI = retardoReenvio(a.getLeftChild());
		}
		
		if(a.hasRightChild()) {
			hijoD = retardoReenvio(a.getRightChild());
		}
		
		return Math.max(hijoI, hijoD) + a.getData(); // agarro el maximo + la raiz
	}
	
	public static void main(String[] args) {
		
		BinaryTree<Integer> ab = new BinaryTree<Integer>(10);
		
		BinaryTree<Integer> hijoIzquierdo = new BinaryTree<Integer>(2);
		
		BinaryTree<Integer> nivel2II = new BinaryTree<Integer>(5);
		BinaryTree<Integer> nivel2ID = new BinaryTree<Integer>(4);
		
		nivel2II.addLeftChild(new BinaryTree<Integer>(7));
		nivel2II.addRightChild(new BinaryTree<Integer>(8));
		
		nivel2ID.addLeftChild(new BinaryTree<Integer>(5));
		nivel2ID.addRightChild(new BinaryTree<Integer>(6));
		
		hijoIzquierdo.addLeftChild(nivel2II);
		hijoIzquierdo.addRightChild(nivel2ID);
		
		BinaryTree<Integer> hijoDerecho = new BinaryTree<Integer>(3);
		BinaryTree<Integer> nivel2DI = new BinaryTree<Integer>(9);
		BinaryTree<Integer> nivel2DD = new BinaryTree<Integer>(8);
		
		nivel2DI.addLeftChild(new BinaryTree<Integer>(12));
		nivel2DI.addRightChild(new BinaryTree<Integer>(8));
		
		nivel2DD.addLeftChild(new BinaryTree<Integer>(2));
		nivel2DD.addRightChild(new BinaryTree<Integer>(1));
		
		hijoDerecho.addLeftChild(nivel2DI);
		hijoDerecho.addRightChild(nivel2DD);
		
		ab.addLeftChild(hijoIzquierdo);
		ab.addRightChild(hijoDerecho);
		
		RedBinariaLlena arbol = new RedBinariaLlena(ab);
		System.out.println("El mayor retardo posible es de: " + arbol.retardoReenvio(ab) + " segundos");
	}
}
