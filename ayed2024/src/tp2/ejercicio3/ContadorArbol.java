package tp2.ejercicio3;

import java.util.ArrayList;
import java.util.List;

import tp1.ejercicio8.Queue;
import tp2.ejercicio1.BinaryTree;

public class ContadorArbol {
	private BinaryTree<Integer> arbol;
	
	public ContadorArbol(BinaryTree<Integer> unArbol){
		this.arbol = unArbol;
	}
	
	
	public List<Integer> listaInorden(){
		List<Integer> paresIn = new ArrayList<>();
		arbolInorden(arbol, paresIn);
		return paresIn;
	}
	
	public List<Integer> listaPostorden(){
		List<Integer> paresPost = new ArrayList<>();
		arbolPostorden(arbol, paresPost);
		return paresPost;
	}
	
	public List<Integer> listaPreorden(){
		List<Integer> paresPre = new ArrayList<>();
		arbolPreorden(arbol, paresPre);
		return paresPre;
	}
	
	public List<Integer> listaPorniveles(){
		List<Integer> paresPorniveles = new ArrayList<>();
		arbolPorniveles(arbol, paresPorniveles);
		return paresPorniveles;
	}
	
	public void arbolInorden (BinaryTree<Integer> arbol, List<Integer> l) {
		if(arbol == null) {
			return;
		}
		
		// busco recursivamente
		// primero el nodo izquierdo
		arbolInorden(arbol.getLeftChild(), l);
		
		if(arbol.getData() % 2 == 0) {
			l.add(arbol.getData());
		}
		//despues el nodo derecho
		arbolInorden(arbol.getRightChild(), l);
		
	}
	
	public void arbolPostorden(BinaryTree<Integer> arbol, List<Integer> l) {
		if(arbol == null) {
			return;
		}
		
		arbolPostorden(arbol.getLeftChild(), l);
		
		arbolPostorden(arbol.getRightChild(), l);
		
		
		// como ultimo agarro la raiz
		if(arbol.getData() % 2 == 0) {
			l.add(arbol.getData());
		}
	}
	
	public void arbolPreorden(BinaryTree<Integer> arbol, List<Integer> l) {
		if(arbol == null) {
			return;
		}
		
		if(arbol.getData() % 2 == 0) {
			l.add(arbol.getData());
		}
		
		arbolPreorden(arbol.getLeftChild(), l);
		
		arbolPreorden(arbol.getRightChild(), l);
	}
	
	public void arbolPorniveles(BinaryTree<Integer> arbol, List<Integer> l) {
		if(arbol.isEmpty()) {
			return;
		}
		
		Queue<BinaryTree<Integer>> cola = new Queue<BinaryTree<Integer>>();
		cola.enqueue(arbol);
		cola.enqueue(null);
		
		while(!cola.isEmpty()) {
			int nivel = cola.size();
			for (int i=0; i<nivel; i++) {
				BinaryTree<Integer> nodo = cola.dequeue();
				if(nodo != null) {
					if(nodo.getData() % 2 == 0) {
						l.add(nodo.getData());
					if(nodo.hasLeftChild())
						cola.enqueue(nodo.getLeftChild());
					if(nodo.hasRightChild())
						cola.enqueue(nodo.getRightChild());
					}
				}
			}
		}
	}
/*
	public static void imprimirPorniveles(BinaryTree<Integer> ab2) {
        BinaryTree<Integer> ab = null;
        Queue<BinaryTree<Integer>> cola = new Queue<BinaryTree<Integer>>();
        cola.enqueue(ab2);
        cola.enqueue(null);
        while (!cola.isEmpty()) {
            ab = cola.dequeue();
            if (ab != null) {
                System.out.print(ab.getData() + " | ");
                if (ab.hasLeftChild()) {
                    cola.enqueue(ab.getLeftChild());
                }
                if (ab.hasRightChild()) {
                    cola.enqueue(ab.getRightChild());
                }
            } else if (!cola.isEmpty()) {
                System.out.println();
                cola.enqueue(null);
            }
        }
 }
	*/
	
	// test
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
		
		
		ContadorArbol contador = new ContadorArbol(ab);
        List<Integer> numerosParesInorden = contador.listaInorden();
        List<Integer> numerosParesPostorden = contador.listaPostorden();
        List<Integer> numerosParesPreorden = contador.listaPreorden();
        List<Integer> numerosParesporniveles = contador.listaPorniveles();

        // Imprimir los números pares encontrados
        System.out.println("números pares inorden:");
        // for-each --> for (Tipo variable : colección) variable: Es la variable que se utilizará para almacenar cada elemento de la colección en cada iteración.
        // colección: Es la colección sobre la cual se va a iterar en este caso la lista de integer
        for (Integer numero : numerosParesInorden) {
            System.out.print(numero + " ");
        }
        System.out.println(' ');
        System.out.println("números pares postorden:");
        for (Integer numero : numerosParesPostorden) {
            System.out.print(numero + " ");
        }
        
        System.out.println(' ');
        System.out.println("números pares postorden:");
        for (Integer numero : numerosParesPreorden) {
            System.out.print(numero + " ");
        }
        
        System.out.println(' ');
        System.out.println("números pares porniveles:");
        for (Integer numero : numerosParesporniveles) {
            System.out.print(numero + " ");
        }
       /* 
        System.out.println(' ');
        System.out.println(' ');
        imprimirPorniveles(ab);
        */
	}
	
}
