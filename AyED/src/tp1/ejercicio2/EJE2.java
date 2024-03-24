package tp1.ejercicio2;

import java.util.Scanner;


public class EJE2 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("ingrese un numero para crear el vector");
		int n = leer.nextInt();
		int [] vector = new int [n];
		vectorEnteros(vector,n);
		imprimirVector(vector, n);
	
	}
	
	public static int [] vectorEnteros(int []v,int n) {
		for (int i =0; i<n; i++){
			v[i]= (i+1)*n;
		}
		return v;
	}
	
	public static void imprimirVector(int []v, int n) {
		for (int i = 0; i<n; i++) {
			System.out.print(v[i]);
			System.out.println(' ');
		}
	}
	
}