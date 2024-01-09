package curso_programacao;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		System.out.println("Olá Mundo!");
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Olá, como foi seu dia? ");
		String resposta = sc.nextLine();
		System.out.println("Oh, então seu dia foi " + resposta + ", poxaaa...");
		sc.close();
	}

}
