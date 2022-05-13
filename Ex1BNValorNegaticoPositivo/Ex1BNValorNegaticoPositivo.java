import java.util.Locale;
import java.util.Scanner;

public class Ex1BNValorNegaticoPositivo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = -30;
		int b = 10;
		int c; 
		System.out.println("Primeiro valor negativo " + a);
		
		System.out.println("Segundo valor positivo " + b);
		
		c = a + b;
		
		System.out.println("SOMA = " + c);
		
		sc.close();

	}

}
