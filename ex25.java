import java.util.Scanner;


public class ex25 {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor do saque: ");
		
		int valor, resto;
		
		int notas100, notas50, notas10, notas5, notas1;
		
		notas100 = 0;
		notas50 = 0;
		notas10 = 0;
		notas5 = 0;
		notas1 = 0;
		
		valor = entrada.nextInt();
		
		notas100 = valor / 100;
		
		resto = valor % 100;
		
		notas50 = resto / 50;
		
		resto = resto % 50;
		
		notas10 = resto / 10;
		
		resto = resto % 10;
		
		notas5 = resto / 5;
		
		resto = resto % 5;
		
		notas1 = resto / 1;
		
		resto = resto % 1;
		
		
		if (valor <= 600 && valor >=10) {
		
		if (notas100 > 0) {
		System.out.println(notas100 + " notas de 100");
		}
		
		if (notas50 > 0) {
		System.out.println(notas50 + " notas de 50");	
		}
		
		if (notas10 > 0) {
			System.out.println(notas10 + " notas de 10");
			}
		
		if (notas5 > 0) {
			System.out.println(notas5 + " notas de 5");
			}
		
		if (notas1 > 0) {
			System.out.println(notas1 + " notas de 1");
			}
		
		
		}
		
		else {
			System.out.println("Valor invalido.");
		}
			
			
			
		
		
	
}
}
