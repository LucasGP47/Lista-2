import java.util.Scanner;



public class ex27 {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("Informe dois numeros:");
		
		float num1, num2;
		float resposta;
		
		num1 = entrada.nextFloat();
		num2 = entrada.nextFloat();
		
		System.out.println("Informe a operaçao: ");
		
		String calculo;
		
		calculo = entrada.next();
		
		if (calculo.contains("soma") || calculo.contains("Soma") ) {
			
			resposta = num1 + num2;
			
		if (calculo.contains("subtraçao") || calculo.contains("Subtraçao")) {
			
			resposta = num1 - num2;
		}
		
        if (calculo.contains("multiplicacao") || calculo.contains("Multiplicacao")) {
			
			resposta = num1 * num2;
		}
		
        if (calculo.contains("divisao") || calculo.contains("divisao")) {
			
			resposta = num1 / num2;
		}
        
        System.out.println("a resposta e: " + resposta);
        
        if (resposta > 0) {
        	System.out.println("numero positivo");
        }
        
        else {
        	System.out.println("numero negativo");
        }
        
        if (resposta % 2 == 0) {
        	System.out.println("numero par");
        }
        
        else {
        	System.out.println("numero impar");
        }
        
        if ((resposta * 10) % 10 == 0) {
        	System.out.println("numero inteiro");
        }
        
        else {
        	System.out.println("numero decimal");
        }
        
        
		
		
		
		
		
		
		
		
		}
		}
}