package questao2_2;

public  class Main {
	public static void main(String[] args) {

		Racional homem = new Racional_();
		Irracional rato = new Irracional_();

		homem.falar();
		rato.emitirSom();

		System.out.println(homem instanceof Racional);
		System.out.println(rato instanceof Irracional_);

		System.out.println(homem instanceof Irracional_);
		System.out.println(rato instanceof Racional);

	}

}
