package questao2._2;

public  class Main {
	public static void main(String[] args) {

		Racional homem = new Racional();
		Irracional rato = new Irracional();

		homem.falar();
		rato.emitirSom();

		System.out.println(homem instanceof RacionalInterface);
		System.out.println(rato instanceof Irracional);

//		System.out.println(homem instanceof Irracional);
//		System.out.println(rato instanceof Racional);

	}

}
