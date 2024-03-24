package tp1.ejercicio5;

public class EJE5 {
	
	private static DataC puntoC;
	
	public static void main(String[] args) {
		int [] vectorEnteros = {2,4,6,8,10};
		
		
		
		// A)
		System.out.println("el maximo del vector es: "+maximoReturn(vectorEnteros));
		System.out.println("el minimo del vector es: "+minimoReturn(vectorEnteros));
		System.out.println("el promedio del vector es: "+promedioReturn(vectorEnteros));
		
		System.out.println("-------------------------------------------------------------");
		
		// B)
		
		
		// C)
		int[] vecC = vectorEnteros;
		puntoC = new DataC();
		puntoC.setVector(vecC);
		Data(vecC);
		System.out.println(puntoC.toString());
		
	}
	
	public static void Data(int [] vec) {
		int max = -1;
		int min = 9999;
		double prom = 0;
		for (int i=0; i< vec.length; i++) {
			if(vec[i]>max) {
				max = vec[i];
			}
			if(vec[i]<min) {
				min = vec[i];
			}
			prom+=vec[i];
		}
		
		puntoC.setMax(max);
		puntoC.setMin(min);
		puntoC.setProm(prom / vec.length);
	}
	
	
	public static int maximoReturn(int []vec) {
		int max = -1;
		for (int i=0; i< vec.length; i++) {
			if(vec[i]>max) {
				max = vec[i];
			}
		}
		return max;
	}
	
	public static int minimoReturn(int []vec) {
		int min = 9999;
		for (int i=0; i< vec.length; i++) {
			if(vec[i]<min) {
				min = vec[i];
			}
		}
		return min;
	}
	
	public static double promedioReturn(int []vec) {
		double prom = 0;
		for (int i=0; i< vec.length; i++) {
			prom+=vec[i];
			}
		prom = (prom / vec.length);
		return prom;
		}
		
	

}
