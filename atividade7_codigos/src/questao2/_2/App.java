package questao2._2;

public  class App {
	public static void main(String[] args) {

		Racional homem = new Racional();
		Irracional rato = new Irracional();

		homem.falar();
		rato.emitirSom();

		System.out.println(homem instanceof RacionalInterface);
		System.out.println(rato instanceof IrracionalInterface);

		System.out.println(homem instanceof IrracionalInterface);
		System.out.println(rato instanceof RacionalInterface);

	}

}
