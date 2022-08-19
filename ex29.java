import java.util.Scanner;


public class ex29 {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("Informe o tipo de gasolina ");
		
		String tipo;
		
		tipo = entrada.next();
		
		System.out.println("Informe a quantidade: ");
		
		float q, x = 0;
		
		q = entrada.nextFloat();
		
		if (tipo.contains("alcool") ||  tipo.contains("Alcool")) {
			
			if (q <= 20) {
			    x = (float) (q * 1.95 - (q * 0.03));
			}
			
			else {
				x = (float) (q * 1.95 - (q * 0.05));	
			}
			
		}
		
        if (tipo.contains("gasolina") ||  tipo.contains("gasolina")) {
			
			if (q <= 20) {
			    x = (float) (q * 2.5 - (q * 0.04));
			}
			
			else {
				x = (float) (q * 2.5 - (q * 0.06));	
			}
        }
               
        System.out.println("O valor e: " + x);
}
}