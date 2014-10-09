import java.util.Scanner;

public class Eje6For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		int n;
				
		System.out.println("Introduce un numero y contaremos hasta el");
		numero = sc.nextInt();
		System.out.println("\n");
		
		for (n=0; n<=numero; n++){
			System.out.println(n+"\n");
		}
		

	}

}