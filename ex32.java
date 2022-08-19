import java.util.Scanner;

public class ex32 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o gabarito: ");
		
		String q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;
		
		int pont = 0;

		q1 = entrada.next();
		q2 = entrada.next();
		q3 = entrada.next();
		q4 = entrada.next();
		q5 = entrada.next();
		q6 = entrada.next();
		q7 = entrada.next();
		q8 = entrada.next();
		q9 = entrada.next();
		q10 = entrada.next();
		
		if (q1.contains("a")) {
			pont = pont + 1;	
		}
		
		if (q2.contains("a")) {
			pont = pont + 1;	
		}
		
		if (q3.contains("b")) {
			pont = pont + 1;	
		}
		
		if (q4.contains("b")) {
			pont = pont + 1;	
		}
	
		if (q5.contains("c")) {
			pont = pont + 1;	
		}
		
		if (q6.contains("c")) {
			pont = pont + 1;	
		}
		
		if (q7.contains("d")) {
			pont = pont + 1;	
		}
		
		if (q8.contains("d")) {
			pont = pont + 1;	
		}
		
		if (q9.contains("e")) {
			pont = pont + 1;	
		}
		
		if (q10.contains("e")) {
			pont = pont + 1;	
		}
		
		System.out.println("Sua nota foi: " + pont);

	}

}
