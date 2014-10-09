import java.util.*;

public class Eje7 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++){
			System.out.println("Dame un valor del vector");
			arr[i]= sc.nextInt();
			System.out.println("\n");
			
		}
		for(int x=0; x< arr.length; x++){
			System.out.println("Los valores del vector son: "+ arr[x]);
			}		

	}

}
