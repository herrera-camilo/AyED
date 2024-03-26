package tp1.ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class G {

	public static void main(String[] args) {
		int num = 6;
		List<Integer> sucesion = calcularSucesion(num);
		System.out.println(sucesion);
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
