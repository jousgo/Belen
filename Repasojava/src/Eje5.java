import java.util.*;

public class Eje5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dia;
		
		System.out.println("Introduce el día de la semana y te diré su nombre");
		dia = sc.nextInt();
		System.out.println("\n");
		
		switch(dia){
			case 1:
				System.out.println("El "+ dia + " corresponde al Lunes");
				break;
			case 2:
				System.out.println("El "+ dia + " corresponde al Martes");
				break;
			case 3:
				System.out.println("El "+ dia + " corresponde al Miércoles");
				break;
			case 4:
				System.out.println("El "+ dia + " corresponde al Jueves");
				break;
			case 5:
				System.out.println("El "+ dia + " corresponde al Viernes");
				break;
			case 6:
				System.out.println("El "+ dia + " corresponde al Sábado");
				break;
			case 7:
				System.out.println("El "+ dia + " corresponde al Domingo");
				break;
		}
		

	}

}
