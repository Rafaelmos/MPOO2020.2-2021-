package questao2._1;

public class Animal implements Racional, Irracional {

	@Override
	public void emitirSom() {
		System.out.println("Emitiu um som");
	}

	@Override
	public void falar() {
		System.out.println("Falou");	
	}

	@Override
	public void andar() {
		System.out.println("Andou");	
	}
	
	
	
}
