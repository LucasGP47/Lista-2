import java.util.Scanner;


public class ex24 {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float media, n1, n2, n3;
		
		System.out.println("Informe as notas do aluno: ");
		
		n1 = entrada.nextFloat();
		n2= entrada.nextFloat();
		n3 = entrada.nextFloat();
		
		media = (n1 + n2 + n3) / 3;
		
		
		
		if (media != 10) {
		
		if (media >= 7) {
			System.out.println("Aprovado! Sua media foi: " + media);
		}
		
		if (media < 7) {
			System.out.println("Reprovado! Sua media foi: " + media);
			
			
		}
		
		}
		
		else {
			System.out.println("Aprovado com distinção!");
		}
		
		
		
	
		
		
	
}
}
