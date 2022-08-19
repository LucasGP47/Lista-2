import java.util.Scanner; 

public class ex10 {
	
public static void main(String[] args) {
		

Scanner entrada = new Scanner(System.in);

int num1, num2, num3, soma, maior;

num1 = entrada.nextInt();

num2 = entrada.nextInt();

num3 = entrada.nextInt();

soma = num1 > num2 ? num1 : num2; 

maior = num3 > soma ? num3 : soma; 

System.out.println("O maior número e " + maior);
	
	
}











}
	
	
	
	
	
	
	
	


