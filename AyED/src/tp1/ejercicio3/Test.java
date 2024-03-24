package tp1.ejercicio3;

public class Test {

	public static void main(String[] args) {
	Estudiante [] vectorEstudiante = new Estudiante [2];
	Profesor [] vectorProfesor = new Profesor [3];
	
	Estudiante E1 = new Estudiante("Jorge", "Moreales", "jogito@gmail.com", 22, "44 y 73");
	Estudiante E2 = new Estudiante("Mariano", "Perez", "mariano@mail.com", 104, "54 y 10");
	
	Profesor P1 = new Profesor("Esteban", "Juri", "juri@mail.com", "A", "UNLP");
	Profesor P2 = new Profesor("Mirta", "ZZZ", "Mirta@mail.com", "B", "UNLP");
	Profesor P3 = new Profesor("Seba", "Juri", "Sebajuri@mail.com", "C", "UNLP");
	
	vectorEstudiante[0] = E1;
	vectorEstudiante[1] = E2;
	
	vectorProfesor[0] = P1;
	vectorProfesor[1] = P2;
	vectorProfesor[2] = P3;
	
	recorroEstudiantes(vectorEstudiante);
	recorroProfesores(vectorProfesor);
	
	
	}

	public static void recorroEstudiantes(Estudiante []vec) {
		for (int i = 0; i<2; i++) {
			 System.out.println(vec[i].tusDatos());
			 System.out.println(" ");
		}
	}
		
		public static void recorroProfesores(Profesor []vec) {
			for (int i = 0; i<3; i++) {
				 System.out.println(vec[i].tusDatos());
				 System.out.println(" ");
			}
		
	}
}
