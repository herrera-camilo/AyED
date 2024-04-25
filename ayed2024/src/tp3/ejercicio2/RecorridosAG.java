package tp3.ejercicio2;

import java.util.LinkedList;
import java.util.List;

import tp1.ejercicio8.Queue;
import tp3.ejercicio1.GeneralTree;

public class RecorridosAG {
	
	private GeneralTree<Integer> arbol;
	
	public RecorridosAG(GeneralTree<Integer>arbol) {
		this.arbol = arbol;
	}
	
	
	public void numerosImparesMayoresQuePreOrden (GeneralTree <Integer> a,Integer n, List <Integer> l){
		int raiz = a.getData(); // agarro la raiz
		if(raiz % 2 != 0 && raiz > n) { // si es impar y mayor a n lo agrego a la lista
			l.add(raiz);
		}
		List<GeneralTree<Integer>> childrens = a.getChildren(); // agarro la lista de hijos
		for (GeneralTree<Integer> child:childrens) {
			numerosImparesMayoresQuePreOrden(child, n, l);
		}
	}
	
	public List<Integer> numerosImparesMayoresQuePreOrden (GeneralTree <Integer> a,Integer n){
		List<Integer> l= new LinkedList<Integer>();
		if(!a.isEmpty()) {
			numerosImparesMayoresQuePreOrden(a, n, l);
		}
		return l;
	}
	
	public void numerosImparesMayoresQueInOrden (GeneralTree <Integer> a, Integer n,List <Integer> l){
		List<GeneralTree<Integer>> childrens = a.getChildren();
		if(a.hasChildren()) {
			numerosImparesMayoresQueInOrden(childrens.get(0), n, l);
		}
		int raiz = a.getData();
		if(raiz % 2 != 0 && raiz > n) { // si es impar y mayor a n lo agrego a la lista
			l.add(raiz);
		}
		for (int i=1;i<childrens.size();i++){
			numerosImparesMayoresQueInOrden(childrens.get(i), n, l);
		}
	}
	
	public List<Integer> numerosImparesMayoresQueInOrden (GeneralTree <Integer> a,Integer n){
		List<Integer>l=new LinkedList<Integer>();
		if(!a.isEmpty()) {
			numerosImparesMayoresQueInOrden(a, n, l);
		}
		return l;
	}
	
	public void numerosImparesMayoresQuePostOrden (GeneralTree <Integer> a,Integer n,List <Integer> l){
		List<GeneralTree<Integer>> childrens = a.getChildren();
		for (int i=0;i<childrens.size();i++) {
			numerosImparesMayoresQuePostOrden(childrens.get(i), n, l);
		}
		int raiz=a.getData();
		if(raiz % 2 != 0 && raiz > n) { // si es impar y mayor a n lo agrego a la lista
			l.add(raiz);
		}
	}
	
	public List<Integer> numerosImparesMayoresQuePostOrden (GeneralTree <Integer> a,Integer n){
		List<Integer> l = new LinkedList<Integer>();
		if(!a.isEmpty()) {
			numerosImparesMayoresQuePostOrden(a, n, l);
		}
		return l;
	}
	
	public List<Integer> numerosImparesMayoresQuePorNiveles(GeneralTree <Integer> a,Integer n){
		List<Integer> l = new LinkedList<Integer>();
		Queue<GeneralTree<Integer>> queue = new Queue<GeneralTree<Integer>>();
		GeneralTree<Integer> aux;
		
		queue.enqueue(a);
		while(!queue.isEmpty()) {
			aux = queue.dequeue();
			if(!aux.isEmpty()) {
				if(aux.getData() % 2 != 0 && aux.getData() > n) {
					l.add(aux.getData());
				}
				if(aux.hasChildren()) {
					List<GeneralTree<Integer>> childrens = aux.getChildren();
					for(GeneralTree<Integer>child:childrens) {
						queue.enqueue(child);
					}
				}
			}
			
		}
		
		return l;
	}
	
	public static void main(String[] args) {
		System.out.println("test");

		List<GeneralTree<Integer>> childrens1 = new LinkedList<GeneralTree<Integer>>();
		childrens1.add(new GeneralTree<Integer>(101));
		childrens1.add(new GeneralTree<Integer>(47));
		childrens1.add(new GeneralTree<Integer>(28));
		GeneralTree<Integer> arbol1 = new GeneralTree<Integer>(12,childrens1);
		
		
		GeneralTree<Integer> arbol2 = new GeneralTree<Integer>(45);
		
		
		List<GeneralTree<Integer>> childrens3 = new LinkedList<GeneralTree<Integer>>();
		childrens3.add(new GeneralTree<Integer>(13));
		childrens3.add(new GeneralTree<Integer>(14));
		childrens3.add(new GeneralTree<Integer>(15));
		GeneralTree<Integer> arbol3 = new GeneralTree<Integer>(21,childrens3);
		List<GeneralTree<Integer>> childrensRaiz = new LinkedList<GeneralTree<Integer>>();
		childrensRaiz.add(arbol1);
		childrensRaiz.add(arbol2);
		childrensRaiz.add(arbol3);
		
		GeneralTree<Integer> raiz = new GeneralTree<Integer>(18,childrensRaiz);
		
		RecorridosAG recorrido = new RecorridosAG(raiz);
		System.out.println("pre:" + recorrido.numerosImparesMayoresQuePreOrden(raiz, 0));
        System.out.println("ino:" + recorrido.numerosImparesMayoresQueInOrden(raiz, 0));
        System.out.println("post:" + recorrido.numerosImparesMayoresQuePostOrden(raiz, 0));
        System.out.println("niveles:" + recorrido.numerosImparesMayoresQuePorNiveles(raiz, 0)); 
		
	}
}
