package tp1.ejercicio7;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class F {

	public static void main(String[] args) {
		ArrayList<Integer> listaI = new ArrayList<>();
		
		// agrego numeros a la lista
		listaI.add(252);
		listaI.add(567);
		listaI.add(8998);
		listaI.add(333);
		listaI.add(5032);
		
		System.out.print(esCapicua(listaI));

	}
	
	public static boolean esCapicua( ArrayList<Integer> l) {
		boolean es = false;
		int dig;
		Scanner leer = new Scanner(System.in);
		System.out.println("ingrese el indice que quiera saber");
		int i = leer.nextInt();
			int resto = 0;
			int num = l.get(i);
			while(num != 0) {
				dig = num % 10;
				resto = (resto)*10 + dig;
				num = num / 10;
			if(resto == l.get(i)) {
				es = true;
			}
			}
		return es;
	}
}
