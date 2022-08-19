import java.util.Scanner;

public class ex22 {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o numero: ");
		
		String num;
		char tamanho1, tamanho2, tamanho3;
		
		int x;
		
		num = entrada.next();
		
		int num1 = Integer.parseInt(num);
		
		x = num.length();
		
		
		if (num1 < 1000 && x == 3 ) {
			
			
			tamanho1 = num.charAt(0);
			
			System.out.println(tamanho1 + " centenas.");
			
            tamanho2 = num.charAt(1);
			
			System.out.println(tamanho2 + " dezenas.");
			
            tamanho3 = num.charAt(2);
			
			System.out.println(tamanho3 + " unidades.");
			
			
			
			
			
			
			
		}
		
		else {
			
			System.out.println("Numero maior que 1000 ou com menos de 3 digitos.");
			
		}
		
		
		
		
		
		
		
}
}
