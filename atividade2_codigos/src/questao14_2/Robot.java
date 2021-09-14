package questao14_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Robot {
	private String nome;
	private String direcao;
	private int andar;
	private ArrayList<Integer> posicao;

	public Robot(String nome, String direcao) {
		this.nome = nome;
		this.direcao = direcao;
		this.posicao = new ArrayList<Integer>(2);
	}

	public void iniciarRobot() {
		if (getPosicao().size() == 0 || posicao == null) {
			getPosicao().add(0);
			getPosicao().add(0);
		}
		retornaPosZero();
		System.out.println(nome + " iniciou");
	}

	public void statusRobot() {
		System.out.println(
				"A posição atual do " + nome + " é: (" + getPosicao().get(0) + "," + getPosicao().get(1) + ")");
		System.out.println("A direção atual do " + nome + " é: " + direcao);
	}

	public void andar() {
		andar = 1;
		andando();
	}

	public void andar(int entrada) {
		andar = entrada;
		andando();
	}

	private void andando() {
		if (direcao == "Norte") {
			getPosicao().set(1, getPosicao().get(1) + andar);
		} else if (direcao == "Sul") {
			getPosicao().set(1, getPosicao().get(1) - andar);
		} else if (direcao == "Leste") {
			getPosicao().set(0, getPosicao().get(0) + andar);
		} else if (direcao == "Oeste") {
			getPosicao().set(0, getPosicao().get(0) - andar);
		}
		if (andar != 1) {
			System.out.println("O " + nome + " andou " + andar + " passos.");
		} else {
			System.out.println("O " + nome + " andou " + andar + " passo.");
		}
	}

	public void mudarPosicao(int x, int y) {
		getPosicao().set(0, x);
		getPosicao().set(1, y);
		System.out.println("A nova posição é: (" + getPosicao().get(0) + "," + getPosicao().get(1) + ")");
	}

	public void mudarDirecao() {
		while (true) {
			try {
				@SuppressWarnings("resource")
				Scanner input = new Scanner(System.in);
				System.out.print(
						"ESCOLHA A NOVA DIREÇÃO\n" + "[0] = Norte  [1] = Sul\n[2] = Leste  [3] = Oeste\n" + "OPÇÃO: ");
				int opcao = input.nextInt();
				if (opcao == 0) {
					direcao = "Norte";
					break;
				} else if (opcao == 1) {
					direcao = "Sul";
					break;
				} else if (opcao == 2) {
					direcao = "Leste";
					break;
				} else if (opcao == 3) {
					direcao = "Oeste";
					break;
				} else {
					System.out.println("OPÇÃO INVALIDA, ESCOLHA UMA OPÇÃO CORRETA");
				}
			} catch (Exception InputMismatchException) {
				System.out.println("OPÇÃO INVALIDA, ESCOLHA UMA OPÇÃO CORRETA");

			}
		}
	}

	public void retornaPosZero() {
		direcao = "Norte";
		getPosicao().set(0, 0);
		getPosicao().set(1, 0);
	}

	public ArrayList<Integer> getPosicao() {
		return posicao;
	}

}
