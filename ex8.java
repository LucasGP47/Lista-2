
import java.util.Scanner; 

public class ex8 {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float n1, n2, media;
		
		System.out.println("Informe a primeira nota: ");
		
		n1 = entrada.nextFloat();
		
		System.out.println("Informe a segunda nota: ");
		
		n2 = entrada.nextFloat();
		
		media = (n1 + n2) / 2;
		
		if (media < 7) {
			
			System.out.println("Reprovado! Sua media foi " + media);
			
		}
		
		else {
			
			System.out.println("Aprovado! Sua media foi " + media);
			
		}
		
















}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

