import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	
	    int origem, preco;
	    
	    System.out.println("Informe o valor do produtor: ");
	    
	    preco = entrada.nextInt();
	    
	    System.out.println("Informe agora o codigo de origem do produto: ");
	    
	    origem = entrada.nextInt();
	    
	    switch (origem) {
	    
	    case 1: 
	    	System.out.println("O valor do produto e: " + preco + " e sua origem e Sul");
	    	break;
	    	
	    case 2: 
	    	System.out.println("O valor do produto e: " + preco + " e sua origem e Norte");
	    	break; 
	    	
	    case 3:
	    	System.out.println("O valor do produto e: " + preco + " e sua origem e Leste");
	    	break;
	    	
	    case 4: 
	    	System.out.println("O valor do produto e: " + preco + " e sua origem e Oeste");
	    	break;
	    
	    case 5:
	    	System.out.println("O valor do produto e: " + preco + " e sua origem e Nordeste");
	    	break;
	    	
	    case 6: 
	    	System.out.println("O valor do produto e: " + preco + " e sua origem e Nordeste");
	    	break;
	    	
	    case 7:  	
	    	System.out.println("O valor do produto e: " + preco + " e sua origem e Centro-Oeste");
	    	break;
	    
	    case 8:	
	    	System.out.println("O valor do produto e: " + preco + " e sua origem e Centro-Oeste");
	    	break;
	    	 
	    }
	    
	    if (origem > 8 ) {
	    	
	    	System.out.println("O valor do produto e: " + preco + " e sua origem e importada");
	    	
	    }
	    
	
	
	
	
	}
}
