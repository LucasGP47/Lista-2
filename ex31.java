import java.util.Scanner;


public class ex31 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a carne que sera comprada:");
		
		String tipo, r;
		
		tipo = entrada.next();
		
		System.out.println("Informe agora a quantidade:");
		
		float q, total = 0, total1 = 0;
		
		q = entrada.nextFloat();
		
		System.out.println("Possue cartao Tabajara?: ");
        
		r = entrada.next();
		
		if (tipo.contains("File Duplo")) {
			
			if (q <= 5) {
				
				total = (float) (q * 4.90);
			}	
			else {
				
				total = (float) (q * 5.80); 
			}
			}
		
		if (tipo.contains("Alcatra")) {
            if (q <= 5) {
				
				total = (float) (q * 5.90);
			}	
			else {
				
				total = (float) (q * 6.80); 
			}
		
		
		}
		
		if (tipo.contains("Picanha")) {
            if (q <= 5) {
				
				total = (float) (q * 6.90);
			}	
			else {
				
				total = (float) (q * 7.80); 
			}
			
		}
		
		if (r.contains("sim")) {
			
			total1 = (float) (total - (total * 0.05)); 
            System.out.println("O valor da compra foi: " + total1);
			System.out.println("O desconto foi de " + (total - total1));
			System.out.println("A quantidade foi de " + q + " e o tipo da carne foi: " + tipo);
			System.out.println("Compra realizada no cartao Tabajara");
		}
		
		else {
			System.out.println("O valor da compra foi: " + total);
			System.out.println("A quantidade foi de " + q + " e o tipo da carne foi: " + tipo);
			System.out.println("Compra realizada no cartao normal");
		}
		}
	
	
	}


