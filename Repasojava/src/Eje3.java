import java.util.*;

public class Eje3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nombre;
		int edad;
		
		System.out.println("Introduce tu nombre:");
		nombre = scan.nextLine();
		System.out.println("\n");
		
		System.out.println("Hola " + nombre + " , por favor introduce tu edad");
		edad = scan.nextInt();
		System.out.println("\n");
		
		if (edad >= 21){
			System.out.println("Genial!! Puedes acudir con nosotros de fiesta. Lo vamos a pasar genial");			
		}else{
			System.out.println("Vete a jugar con las barbies que ya tendras tiempo de ir de fiesta...");
		}
		
	

	}

}
