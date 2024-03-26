package tp1.ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class H {

	public static void main(String[] args) {
		int num = 6;
		List<Integer> sucesion = calcularSucesion(num);
		System.out.println(sucesion);
		
		invertirArrayList(sucesion);
		System.out.println(sucesion);

		
	}
	
	public static void invertirArrayList(List<Integer> lista) {
			System.out.println(lista.size());
			procesoInvertirRecursivo(lista, 0, lista.size()-1); // el -1 es porque el lista.size te tira 9 pero la lista va de 0 a 8
																// si no tuviera el -1 te da error
		}
	
	public static void procesoInvertirRecursivo(List<Integer> lista, int inicio, int fin) {
		if(inicio >= fin) {
			return;
		}
			int temp = lista.get(inicio); // me guardo el primero para no perderlo
			lista.set(inicio, lista.get(fin)); // pongo el ultimo en el primer lugar
			lista.set(fin, temp); // pongo el primero en el ultimo lugar
		
		procesoInvertirRecursivo(lista, (inicio)+1, (fin)-1); // le sumo uno al inicio para hacer el segundo y resto al ultimo porque ya lo tengo
	}
		

	
	
	public static List <Integer> calcularSucesion (int n) {
			List<Integer> listaN = new ArrayList<>();
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


}
