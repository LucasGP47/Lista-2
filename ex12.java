import java.util.Scanner;

public class ex12 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int salario;
		double aumento;
		double novo_salario = 0;
		
		
		System.out.println("Informe o salario inteiro: ");
		
		salario = entrada.nextInt();
		
		if (salario <= 280) {
			
			novo_salario = salario + (salario * 0.20);
			System.out.println("O salario era " + salario);
			System.out.println("O percentual de aumento foi 20%");
			System.out.println("O novo salario e " + novo_salario);
			
			
		}
		
		if (280 < salario) {
		   
			if (700 > salario) {
				
				novo_salario = salario + (salario * 0.15);
				System.out.println("O salario era " + salario);
				System.out.println("O percentual de aumento foi 15%");
				System.out.println("O novo salario e " + novo_salario);
			}
			
		}
		
		if (salario > 700) {
			
			if (salario < 1500) {
			
				novo_salario = salario + (salario * 0.10);
				System.out.println("O salario era " + salario);
				System.out.println("O percentual de aumento foi 10%");
				System.out.println("O novo salario e " + novo_salario);
			}
			
		}
		
		if (salario > 1500) {
			
			novo_salario = salario + (salario * 0.05);
			System.out.println("O salario era " + salario);
			System.out.println("O percentual de aumento foi 5%");
			System.out.println("O novo salario e " + novo_salario);
			 
		}
			
			
			
		aumento = novo_salario - salario; 
		System.out.println("O aumento foi de " + aumento);
		
		
		
	
		
		
		}
		
		
		
		
		
		
		
		
		
	}
	
	
	


