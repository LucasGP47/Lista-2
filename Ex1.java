import java.util.Scanner;

public class Ex1 {

	public static void main (String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escreva um numero:");
		
		float num1 = entrada.nextFloat();
		
		System.out.println("Escreva outro numero:");
		
		float num2 = entrada.nextFloat();
		
		System.out.print("O maior numero e: ");
		
		if (num1>num2) {
			System.out.println(num1);
		}
		
		else {
			if (num1<num2) {
				System.out.println(num2);	
			}
		}
			
	}

}
