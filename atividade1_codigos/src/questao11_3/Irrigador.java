package questao11_3;

public class Irrigador {

	private boolean irrigar;

	public Irrigador(boolean irrigar) {
		super();
		this.irrigar = irrigar;
	}

	public void ligar_Desligar() {
		if (irrigar == true) {
			irrigar = false;
			System.out.println("Irrigador Desligado");
			
		} else {
			irrigar = true;
			System.out.println("Ligando Irrigador...");
			solicitarAgua();
		}
	}

	public void solicitarAgua() {
		Reservatorio reservatorio = new Reservatorio(15, 20, false);
		reservatorio.verificarAgua();

	}

	public boolean isIrrigar() {
		return irrigar;
	}

	public void setIrrigar(boolean irrigar) {
		this.irrigar = irrigar;
	}

}
