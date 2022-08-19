import java.util.Scanner; 

public class ex4 {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um ano com quatro digitos: ");
		
		int ano = entrada.nextInt();
		
		System.out.println(" ");
		
		if (ano < 1000) {
			
			System.out.println("Numero com menos de 4 digitos! ");
	
		}
		
		else {
			
			if (ano % 4 == 0) {
				
				System.out.println(ano + " e bissexto");
				
				
			}
			
			else {
				System.out.println(ano + " nao e bissexto");
			}
			
			
		}
















}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
