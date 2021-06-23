import java.util.Scanner;

public class LendoDados {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String fon;
		
		System.out.println("Por favor, insira seu nome:");
		fon =sc.nextLine();
		System.out.println("Bem vindo, " + fon);
		System.out.printf("Bem vindo, %s", fon);
		
		sc.close();
		
	}
}
