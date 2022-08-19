import java.util.Scanner;

public class ex16 {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe as suas notas: ");
		
		float  nota1, nota2, nota3, media;
		
		nota1 = entrada.nextFloat();
		
		nota2 = entrada.nextFloat();
		
		nota3 = entrada.nextFloat();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		if (media <=3 && media >= 0) {
			
         System.out.println("Reprovado.");		
		}
		
		if (media >= 3 && media <= 6.9) {
			
	         System.out.println("Em Exame.");		
			}
		
		if (media >= 7  && media <= 10) {
			
	         System.out.println("Aprovado.");		
			}

		
		
		
		
		
		
		
		
		
		
		
		
 }
}
