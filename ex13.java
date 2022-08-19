import java.util.Scanner;


public class ex13 {
	
        public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int salario_bruto, horas, salario_liquido, vh;
		
		System.out.println("Informe o número de horas trabalhadas no mes: ");
		
		horas = entrada.nextInt();
		
		System.out.println("Informe o valor da hora trabalhada: ");
		
		vh = entrada.nextInt();
		
		salario_bruto = horas * vh; 
	
		if (salario_bruto < 900) {
			
			salario_liquido = (int) (salario_bruto - (salario_bruto * 0.05));
			
			
			
		
		}
	
	
	
	
	
	
	
	
        }
}
