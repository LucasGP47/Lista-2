import java.util.Scanner;


public class ex26 {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um numero inteiro: ");
		
		int num;
		
		num = entrada.nextInt();
		
		if ((num % 2) == 0) {
			System.out.println("E par.");
		}
		
		else {
			System.out.println("E impar.");
		}
		
		
	
}
}
