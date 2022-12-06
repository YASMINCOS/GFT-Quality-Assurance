import java.util.Scanner;

public class RPG {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		String msgMorto = "Jogador nao sobreviveu";
		String msgVivoVenceu = "Jogador sobreviveu e derrotou o inimigo";
		String msgVivoPerdeu = "Jogador sobreviveu e nao derrotou o inimigo";

		int dados = leitor.nextInt();
		int vidaDoJogador =leitor.nextInt();
		int ataqueDoJogador = leitor.nextInt();
		int defesaDoJogador = leitor.nextInt();
		int vidaDoInimigo = leitor.nextInt();
		int ataqueDoInimigo =  leitor.nextInt();

		if (dados == 9) {
			defesaDoJogador = (dados + defesaDoJogador) * 2;
			ataqueDoJogador = (dados + ataqueDoJogador) * 2;
		}

		vidaDoJogador = vidaDoJogador - (ataqueDoInimigo - (defesaDoJogador + dados));
		vidaDoInimigo = vidaDoInimigo - (ataqueDoJogador + dados);

		if (vidaDoJogador <= 0) {
			System.out.println(msgMorto);
		} else {
			if (vidaDoInimigo <= 0) {
				System.out.println(msgVivoVenceu);
			} else {
				System.out.println(msgVivoPerdeu);
			}
		}

	}
}