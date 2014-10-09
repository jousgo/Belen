import java.util.*;

public class Eje6Do {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		int contador=0;
		
		System.out.println("Introduce un numero y contaremos hasta el");
		numero = sc.nextInt();
		System.out.println("\n");
		
		do{
			System.out.println(contador+ "\n");
			contador ++;
		}while(contador <= numero);
		

	}

}
