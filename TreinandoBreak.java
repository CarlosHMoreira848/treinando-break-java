import java.util.Scanner;
public class TreinandoBreak {
	public static void main(String[] args) {
		java.util.Scanner entrada = new Scanner(System.in);
		int parada;
		System.out.println("Bem vindo ao programa: Treinando uma condição de parada com break!");
		System.out.println("Escreveremos uma sequência até 100... Digite onde deseja que a sequência pare! ");
		parada = entrada.nextInt();
		if(parada > 100 || parada < 1) {
			System.out.println("Opa! Você deveria digitar um valor entre 1 e 100... Tente novamente!");
		} else {
			for(int i = 0; i <= 100; i++) {
				if(parada == i) {
					System.out.println(i);
					break;
				}
				System.out.println(i);
			}
		}
	}
}
