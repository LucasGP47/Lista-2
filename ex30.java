import java.util.Scanner;


public class ex30 {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a fruta: ");
		
		String tipo;
		
		tipo = entrada.next();
		
		System.out.println("Informe a quantidade em quilos: ");
		
		float q;
		double valor = 0;
		
		q = entrada.nextFloat();
		
		
		
		if (tipo.contains("morango") || tipo.contains("Morango") ) {
		
		   if (q <= 5) {
			   
			   valor = q * 2.5;  
		   }
		   
		   if (q > 5 && q <=8 ) {
			   
			   valor = q * 2.2;
		   }
		   
		   if (q > 8 ) {
			   
			   valor = q * 2.2;
			   valor = valor - (valor * 0.1);
		   }
		}
	    if (tipo.contains("maca") || tipo.contains("Maca") ) {
			
		   if (q <= 5) {
			   
			   valor = (q * 1.8);  
		   }
		   
		   if (q > 5 || q <=8 ) {
			   
			   valor = (q * 1.5);
		   }
		   
		   if (q > 8 || valor > 25 ) {
			   
			   valor = (q * 1.5);
			   valor = (valor - (valor * 0.1));
		   }   
	    }
		   System.out.println("O valor da compra e: " + valor);
		   
	
}
}
