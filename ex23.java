import java.util.Scanner;

public class ex23 {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe as idades dos alunos: ");
		
		int i1, i2, i3;
		
		float media;
		
		
		i1 = entrada.nextInt();
		i2 = entrada.nextInt();
		i3 = entrada.nextInt();
		
		media = (i1 + i2 + i3) / 3;
		
		if (media < 25) {
			
			System.out.println("Turma Jovem.");
		}
		
		if (media >= 25 && media <=40) {
			System.out.println("Turma adulta");
		}
		
		if (media >40) {
			
			System.out.println("Turma idosa.");
		}



	
	
	
}
}
