package tp1.ejercicio7;

import java.util.ArrayList;
import java.util.Scanner;
public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>();
		
		// agrego numeros a la lista
		lista.add(10);
		lista.add(20);
		lista.add(30);
		lista.add(40);
		lista.add(50);
		
		for (int i=0;i<lista.size();i++) {
			System.out.println(lista.get(i));
		}
		
		Estudiante est1 = new Estudiante("mario", "gomez", "mario@mail.com", 54, "10 n1932");
		
		Estudiante est2 = new Estudiante("camilo", "pepe", "esteban@mail.com", 69, "111 n19343");
		
		Estudiante est3 = new Estudiante("jorge", "gomez", "jorge@mail.com", 4, "50 n1956");
		
		ArrayList<Estudiante> listaE = new ArrayList<>();
		
		listaE.add(est1);
		listaE.add(est2);
		listaE.add(est3);
		
		imprimirLista(listaE);
		
		System.out.println("-----------------------------------------------");
		modificarComision(listaE);
		imprimirLista(listaE);
		System.out.println("-----------------------------------------------");
		agregarEstudiante(listaE);
		imprimirLista(listaE);
		
		
	}
	
	public static void imprimirLista(ArrayList<Estudiante> l) {
		for (int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
	}
	
	public static void modificarComision(ArrayList<Estudiante> l) {
		for (int i=0;i<l.size();i++) {
			Estudiante modifico = l.get(i);
			modifico.setComision(i);
			Scanner leer = new Scanner(System.in);
			System.out.println("ingrese un numero de comision");
			int n = leer.nextInt();
			modifico.setComision(n);
			l.set(i, modifico);
		}
	}
	
	public static void agregarEstudiante(ArrayList<Estudiante> l) {
		Estudiante est4 = new Estudiante("camilo", "herrera", "camilo@mail.com", 777, "513 n1956");
		boolean meto = false;
		for (int i=0;i<l.size();i++) {
			Estudiante ver = l.get(i);
			if(est4.getNombre().equals(ver.getNombre()) && est4.getApellido().equals(ver.getApellido())&& meto!=true) {
				meto = true;
			}
		}
		if(meto==false) {
			l.add(est4);
			System.out.println("estudiante agregado correctamente");
		}
		else
			System.out.println("el estudiante ya existia y no se agregó");
	}
}
