package tp1.ejercicio7;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class J {
	public static void main(String[] args) {
		ArrayList<Integer> Lista1 = new ArrayList<>();
		ArrayList<Integer> Lista2 = new ArrayList<>();
		// genero lista 1
		Lista1.add(2);
		Lista1.add(4);
		Lista1.add(6);
		Lista1.add(8);
		Lista1.add(10);
		
		// genero lista 2
		Lista2.add(1);
		Lista2.add(3);
		Lista2.add(5);
		System.out.println(combinarOrdenado(Lista1,Lista2));
		
	}
	
	public static ArrayList<Integer> combinarOrdenado (ArrayList<Integer> lista1,
			ArrayList<Integer> lista2){
		ArrayList<Integer> nueva = new ArrayList<>();
		int inicio1 = 0;
		int inicio2 = 0;
		while(inicio1 < lista1.size() && inicio2<lista2.size()) {
			if(lista1.get(inicio1)< lista2.get(inicio2)) {
				nueva.add(lista1.get(inicio1));
				inicio1++;
			}
			else {
				nueva.add(lista2.get(inicio2));
				inicio2++;
			}
		}
		
		while(inicio1 < lista1.size()) {
			nueva.add(lista1.get(inicio1));
			inicio1++;
		}
		
		while(inicio2 < lista2.size()) {
			nueva.add(lista2.get(inicio2));
			inicio2++;
		}
		
		return nueva;
	}

}
