package questao14_1;

public class Fruta {
	private String nome;
	private boolean casca;
	private boolean caroco;
	private int quantCarocos;

	public Fruta(boolean casca, boolean caroco, int quantCarocos, String nome) {
		super();
		this.nome = nome;
		this.casca = casca;
		this.caroco = caroco;
		this.quantCarocos = quantCarocos;
	}

	public void retirarCaroco() {
		if (caroco) {
			while (quantCarocos > 0) {
				quantCarocos--;
				System.out.println("A fruta agora tem " + quantCarocos + " caroços");
			}
			if (quantCarocos <= 0) {
				quantCarocos = 0;
				caroco = false;
				System.out.println("Todos os caroços foram retirados");
			}
		} else {
			System.out.println("A fruta não tem caroço");
		}
	}

	public void retirarCasca() {
		if (casca) {
			casca = false;
			System.out.println("A casca foi retirada da fruta");
		} else {
			System.out.println("A fruta não tem casca");
		}
	}

	public void comerFruta(Fruta f) {
		if (!caroco && !casca) {
			f = null;
			System.gc();
			System.out.println("A fruta foi comida");
		} else if (caroco && casca) {
			System.out.println("Não foi possível comer a fruta, por favor retire os caroços e a casca");
		} else if (caroco && quantCarocos > 0) {
			System.out.println("Não foi possível comer a fruta, por favor retire os caroços");
		} else if (casca) {
			System.out.println("Não foi possível comer a fruta, por favor retire a casca");
		}

	}


}
