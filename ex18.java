import java.util.Scanner;

public class ex18 {

public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe os lados do triangulo: ");
		
	    float lado1, lado2, lado3;
	    
	    lado1 = entrada.nextFloat();
	    
	    lado2 = entrada.nextFloat();
	    
	    lado3 = entrada.nextFloat();
	    
	    if (lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado1 + lado3 > lado2) {
	    	
	      
	         if (lado1 == lado2 && lado1 == lado3 && lado2==lado3) {
	    	
	    	System.out.println("triangulo equilatero.");
	         }
	     
	         if (lado1 == lado2 || lado2 == lado3 || lado1==lado3) {
	    	
	    	    if (lado2 != lado3 || lado1 != lado3 || lado1 != lado2) {
	    	    System.out.println("triangulo isoceles.");
	    	
	            }
	         }  
	    if (lado1 != lado2 && lado1 != lado3 && lado2!=lado3) {
	    	
	    	System.out.println("triango escaleno.");	
	    }
        
	    }
	    
	    else {
	    	
	    	System.out.println("nao e um triangulo.");
	    }
	
	
	
	
	
	
	
}
}
