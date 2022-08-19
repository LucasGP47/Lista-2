import java.util.Scanner;

public class ex14 {
	

    public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	int dia; 
	
    dia = entrada.nextInt();
    
    switch (dia) {
    
    case 1:
    	System.out.println("O dia e domingo");
    	break;
    	
    case 2:
    	System.out.println("O dia e segunda");
    	break;
    	
    case 3: 
    	System.out.println("O dia e terça");
    	break;
    	
    case 4:
    	System.out.println("O dia e quarta");
    	break;
    	
    case 5:
    	System.out.println("O dia e quinta");
    	break;
    	
    case 6:	
    	System.out.println("O dia e sexta");
    	break;
    	
    case 7: 
    	System.out.println("O dia e sabado");
    	break;
    	  
    }
	
	if (dia > 7) {
		System.out.println("invalido");
	}
	
	
	
    }
}
