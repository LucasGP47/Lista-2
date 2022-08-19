
import java.util.Scanner;

public class ex21 {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe uma data no formato dd: ");
		
		String dias, mes, ano;
		int t, x, y; 
		
		dias = entrada.next();
		
		System.out.println("Informe uma data no formato mm: ");
		
		mes = entrada.next();
		
		System.out.println("Informe uma data no formato aaaa");
		
		ano = entrada.next();
		
		t = dias.length();
		
		x = mes.length();
		
		y = ano.length();
		
		int mesn = Integer.parseInt(mes);
		
		int dian = Integer.parseInt(dias);
		
		int anon = Integer.parseInt(ano);	
			
		if (t == 2 && dian < 31 && dian > 0) {
			
			if (x == 2 && mesn <= 12 && mesn >0) {
				
				if (y == 4 && anon > 0) {
					
					System.out.println("A data e valida.");
				}
				
				else {
					System.out.println("Ano invalido.");
				}
			
			
			}
			else {
				System.out.println("Mes invalido");
				 
			}
			
			
			
	
		}
		else {
			System.out.println("Dia invalido");
		}

		
	
		
		
     
		
					

		
}
}
		     
		
	
		
		
	
	
	
	


