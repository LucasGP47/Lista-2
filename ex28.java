import java.util.Scanner;


public class ex28 {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String r1, r2, r3, r4, r5;
		
		int contador = 0;
		
		System.out.println("Telefonou para a vitima?");
		
		r1 = entrada.next();
		
		System.out.println("Esteve no local do crime?");
		
		r2 = entrada.next();
		
		System.out.println("Mora perto da vitima?");
		
		r3 = entrada.next();
		
		System.out.println("Devia para a vitima?");
		
		r4 = entrada.next();
		
		System.out.println("Ja trabalhou com a vitima?");
		
		r5 = entrada.next();
		
		if (r1.contains("sim") || r1.contains("Sim")) {
			contador = contador + 1;
		}
		
		if (r2.contains("sim") || r2.contains("Sim")) {
			contador = contador + 1;
		}
		
		if (r3.contains("sim") || r3.contains("Sim")) {
			contador = contador + 1;
		}
		
		if (r4.contains("sim") || r4.contains("Sim")) {
			contador = contador + 1;
		}
		
		if (r5.contains("sim") || r5.contains("Sim")) {
			contador = contador + 1;
		}
		
		
		System.out.println(" ");
	switch (contador) {
	
	case 0: 
		System.out.println("Inocente.");
		break;
		
	case 1:
		System.out.println("Inocente.");
		break;
		
	case 2:
		System.out.println("Suspeita.");
		break;
		
	case 3:
		System.out.println("Cumplice.");
		break;
		
	case 4:
		System.out.println("Cumplice.");
		break;
		
	case 5:
		System.out.println("Assassino.");
		break;
	}
}
}
