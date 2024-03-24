package tp1.ejercicio5;

public class DataC {
	private int max;
	private int min;
	private double prom;
	private int [] vector;
	

	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public double getProm() {
		return prom;
	}
	public void setProm(double prom) {
		this.prom = prom;
	}

	@Override
	public String toString() {
		return "[el maximo del vector es: " + max + "| el minimo del vector es: " + min + "| el promedio del vector es:" + prom + "]";
	}

	public int[] getVector() {
		return vector;
	}

	public void setVector(int[] vector) {
		this.vector = vector;
	}
	
}
