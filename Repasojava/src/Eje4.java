import java.util.*;
public class Eje4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Por favor, introduce un número y te dire si es par o impar");
		numero = sc.nextInt();
		System.out.println("\n");
		
		if (numero %2==0){
			System.out.println("El número "+ numero + " es par");
		}else{
			System.out.println("El número "+ numero + " es impar");
		}
	}
}
