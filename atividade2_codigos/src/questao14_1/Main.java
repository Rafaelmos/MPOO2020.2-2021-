package questao14_1;

public class Main {
	public static void main(String[] args) {
		Fruta fruta = new Fruta(true, true, 25, "Melancia");
		Fruta fruta2 = new Fruta(true, true, 1, "Abacate");
		Fruta fruta3 = new Fruta(true, false, 0, "uva");
		Fruta fruta4 = new Fruta(false, true, 0, "limão");
		Fruta fruta5 = new Fruta(false, false, 0, "laranja");

		fruta.comerFruta(fruta);
		fruta.retirarCaroco();
		fruta.retirarCasca();
		fruta.comerFruta(fruta);
	}

}

