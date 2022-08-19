import java.util.Scanner;

public class ex17 {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe as notas:");
		
		float n1, n2, media;
		
		n1 = entrada.nextFloat();
		n2 = entrada.nextFloat();
		
		media = (n1 + n2) / 2;
		
		if (media <= 10 && media >=9) {
			System.out.println("A em aproveitamento");
		}
		
		if (media <9 && media >= 7.5) {
			System.out.println("B em aproveitamento");
		}
		
		if (media < 7.5 && media >= 6) {
			System.out.println("C em aproveitamento");
		}
		
		if (media < 6 && media >= 4) {
			System.out.println("D em aproveitamento");
		}
		
		if (media < 4 && media >= 0) {
			System.out.println("E em aproveitamento");
		}
	
	 
	
	
}
}
