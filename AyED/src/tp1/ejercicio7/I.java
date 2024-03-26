package tp1.ejercicio7;

import java.util.LinkedList;
import java.util.List;

public class I {
	public static void main(String[] args) {
		int num = 6;
		LinkedList<Integer> sucesion = calcularSucesion(num);
		System.out.println(sucesion);
		System.out.println(sumarRecursivo(sucesion));
	}
	
	public static LinkedList <Integer> calcularSucesion (int n) {
		LinkedList<Integer> listaN = new LinkedList<>();
			listaN.add(n);
			
			if(n == 1) {
				return listaN;
				}
			if( (n % 2) == 0) {
				listaN.addAll(calcularSucesion(n/2)); //agrega todos los elementos generados por la función recursiva a la lista de sucesión.
			} 
			else
				listaN.addAll(calcularSucesion(n * 3 + 1));
			
			return listaN;
		}
	
	public static int sumarRecursivo(LinkedList<Integer> lista) {
		return procesoSuma(lista, 0);
	}
	
	public static int procesoSuma(LinkedList<Integer> lista, int inicio) {
		if(inicio >=lista.size()) {
			return 0;
		}
		return lista.get(inicio) + procesoSuma(lista, inicio + 1);
		
	}
	
}


