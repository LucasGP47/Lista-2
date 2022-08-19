import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um numero:");
		
		float num1 = entrada.nextFloat();
		
		if (num1 > 0) {
			
			System.out.println(num1  + " e positivo"); 
			
		}
		
		else {
			if (num1 < 0) {
				System.out.println(num1 + " e negativo");
			}
			else {
				System.out.println(num1 + " e nulo");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}


