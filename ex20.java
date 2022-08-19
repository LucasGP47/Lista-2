import java.util.Scanner;

public class ex20 {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um ano:");
		
		int ano; 
		
		ano = entrada.nextInt();
		
		if (ano % 4 == 0) {
			
			System.out.println(ano + " e bissexto");
			
		}
		
		else {
			System.out.println("Nao e bissexto. ");
		}
		
		

}
}
