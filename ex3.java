import java.util.Scanner;

public class ex3 {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	    
		System.out.println("Informe o sexo (somente F ou M): ");
		
		String letra = entrada.next();
		
		if (letra.contains("F")) {
			
			System.out.println("Sexo feminino! ");
				
		}
		
		else {
			
			if (letra.contains("M")) {
				
				System.out.println("Sexo masculino! ");
				
			}
			
			else {
				
				System.out.println("Opçao invalida! ");
				
			}
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
     }
}
