
import java.util.Scanner; 

public class ex7 {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2, num3, soma, maior, menor; 
		int x;
		
		x=0;
		System.out.println("Informe o primeiro numero: ");	
		
		num1 = entrada.nextInt();
		
		System.out.println("Informe o segundo numero: ");
		
		num2 = entrada.nextInt();
		
		System.out.println("Informe o terceiro numero: ");
		
		num3 = entrada.nextInt();
		
		if(num1<num2) {
            if(num3<num1) {
                menor = num3;
            } else {
                menor = num1;
            }
        } else {
            if(num2<num3) {
                menor = num2;
            } else {
                menor = num3;
            }
        }
		
		soma = num1 > num2 ? num1 : num2; 

		maior = num3 > soma ? num3 : soma;
		
		if(num2>num1 && num1>num3 || num3>num1 && num1>num2){
	        
			x=num1;
		} 
		
		else { 
			if(num1>num2 && num2>num3 || num3>num2 && num2>num1){
				x=num2;
		}
		       
	    	        
	         
        else {
        	if(num1>num3 && num3>num2 || num2>num3 && num3>num1){
	        
	    	x = num3;
        	}  
	    }
		}   
		System.out.println("Ordem decrescente é: " + maior + ", " + x + ", " + menor);
		
		}
		















}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


