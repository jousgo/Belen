import java.util.*;
public class Eje2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String n;
		float alt;
		int edad;
		
		System.out.println("Introduce tu nombre: \n");
		n = scan.nextLine();
		
		System.out.println("Introduce tu altura: \n");
		alt = scan.nextFloat();
		
		System.out.println("Introduce tu edad: \n");
		edad = scan.nextInt();
		
		System.out.println("Hola " + n + ", tu edad es de " + edad + " y tu altura es de " + alt);
		
		
	}

}
