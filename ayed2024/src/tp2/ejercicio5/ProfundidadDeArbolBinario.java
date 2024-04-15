package tp2.ejercicio5;

import tp2.ejercicio1.BinaryTree;

public class ProfundidadDeArbolBinario {
	private BinaryTree<Integer> arbol;
	
	public ProfundidadDeArbolBinario(BinaryTree<Integer> unArbol) {
		this.arbol = unArbol;
	}
	
	
	public int suma(int p){
		if(arbol.isEmpty()) {
			return 0;
		}else {
			return suma(p,arbol,0);
		}
		
	}
	
	private int suma(int p, BinaryTree<Integer> ar, int nivelActual) {
		if(p == nivelActual) {
			return ar.getData();
		}else {
		
		int sumar =0;
		if(ar.hasLeftChild()) {
			sumar+= suma(p,ar.getLeftChild(),nivelActual+1);
		}
		if(ar.hasRightChild()) {
			sumar+=suma(p,ar.getRightChild(),nivelActual+1);
		}
		return sumar;
		}
	}
	
	
	public static void main(String[] args) {
		BinaryTree<Integer> ab = new BinaryTree<>(18);
        BinaryTree<Integer> hijoIzquierdo = new BinaryTree<>(2);
        BinaryTree<Integer> hijoDerecho = new BinaryTree<>(4);
        
        hijoIzquierdo.addLeftChild(new BinaryTree<Integer> (44));
        hijoIzquierdo.addRightChild(new BinaryTree<Integer>(1));
        
        hijoDerecho.addLeftChild(new BinaryTree<Integer>(6));
        BinaryTree<Integer> abDerecho = new BinaryTree<Integer>(8);
        hijoDerecho.addRightChild(abDerecho);
        
       abDerecho.addLeftChild(new BinaryTree<Integer>(16));
       abDerecho.addRightChild(new BinaryTree<Integer>(5));
		
		ab.addRightChild(hijoDerecho);
		ab.addLeftChild(hijoIzquierdo);
		
		
		
		ProfundidadDeArbolBinario profu = new ProfundidadDeArbolBinario(ab);
		System.out.println(profu.suma(3));
		
	}
	
}
