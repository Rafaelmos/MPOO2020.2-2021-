package questao11_3;

public class Reservatorio {
	private int capacidadeOcupada;
	private int capacidadeTotal;
	private boolean resposta;

	public Reservatorio(int capacidadeOcupada, int capacidadeTotal, boolean resposta) {
		super();
		this.capacidadeOcupada = capacidadeOcupada;
		this.capacidadeTotal = capacidadeTotal;
		this.resposta = resposta;
	}

	public void verificarAgua() {
		if (capacidadeOcupada > 0) {
			resposta = true;
			while (resposta == true) {
				System.out.println("Possuimos " + capacidadeOcupada + " para serem utilizados");
				capacidadeOcupada--;
				verificarAgua();
				break;
			}
		} else {
			Irrigador irrigador = new Irrigador(true);
			irrigador.setIrrigar(false);
			System.out.println("Irrigador Desligado");
			System.out.println("Reservátorio vázio");
			System.out.println("Enchendo reservátorio");
			encherReservatorio();
		}
	}

	public void encherReservatorio() {
		while (capacidadeOcupada < capacidadeTotal) {
			capacidadeOcupada++;
		}
		System.out.println("Reservátorio tem a capacidade ocupada de: " + capacidadeOcupada + " litros");
		System.out.println("Reservátorio Cheio");

	}

	public int getCapacidadeOcupada() {
		return capacidadeOcupada;
	}

	public void setCapacidadeOcupada(int capacidadeOcupada) {
		this.capacidadeOcupada = capacidadeOcupada;
	}

	public int getCapacidadeTotal() {
		return capacidadeTotal;
	}

	public void setCapacidadeTotal(int capacidadeTotal) {
		this.capacidadeTotal = capacidadeTotal;
	}

	public boolean isResposta() {
		return resposta;
	}

	public void setResposta(boolean resposta) {
		this.resposta = resposta;
	}
}
