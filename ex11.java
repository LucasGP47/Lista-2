import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		
		String turno;
		

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o turno em que voce estuda. Digite V para vespertino, M para matutino e N noturno.");
	    
		turno = entrada.next();
		
		if (turno.contains("V")) {
			
			System.out.println("Boa Tarde!");
				
		}
		
		else {
			
			if (turno.contains("M")) {
				
				System.out.println("Bom dia!");
				
			}
			
			else {
				
				if(turno.contains("N")) {
					
					System.out.println("Boa Noite!");
					
				}
				
				else {
					
					System.out.println("Invalido!");
					
				}
			}
		}
}
	
}
