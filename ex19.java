import java.util.Scanner;

public class ex19 {
	
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		float a, b, c, delta, r1, r2;
		
		System.out.println("Informe o valor do a");
		
		a = entrada.nextFloat();
		
		System.out.println("Informe o valor de b");
		
		b= entrada.nextFloat();
		
		System.out.println("Informe o valor de c");
		
		c = entrada.nextFloat();
		
		if (a != 0) {
			
			delta = b * b  - 4 * a * c;
			
			if (delta >= 0 ) {
				
				r1 = (float) (-1 * b + Math.sqrt(delta) / 2);
				r2 = (float) (-1 * b - Math.sqrt(delta) / 2);
				 System.out.println("As raizes sao: " + r1 + ", " + r2);
			}
			
			else {
				System.out.println("Delta negativo!");
			 
			}
			}
		else {
			System.out.println("a negativo, conta invalida.");
		}
		
		
		
}
}
