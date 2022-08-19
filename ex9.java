import java.util.Scanner; 

public class ex9 {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float peso, altura;
		
		String sexo;
		
		System.out.println("Informe a sua altura: ");
		
		altura = entrada.nextFloat();
		
		System.out.println("Agora informe seu sexo: ");
		
		sexo = entrada.next();
		
		System.out.println("Agora informe seu peso: ");
		
		if (sexo.contains("masculino")) {
			
			System.out.println("Seu peso ideal e " + ((72.7 * altura) - 58));
			
		}
		
		else {
			 if (sexo.contains("feminino")) {
				 
				 System.out.println("Seu peso ideal e" +((62.1 * altura) - 44.7));
				 
			 }
			
			 else {
				 
				 System.out.println("Sexo invalido");
			 }
			
			
		}
		
		
		
		
		
		
		
}

}