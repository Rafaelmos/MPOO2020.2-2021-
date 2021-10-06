package questao1;

public class Sobrecarga {
	public Sobrecarga() {
		super();
	}

	private void metodoDaSobrecarga() {
		System.out.println("Sobrecarga 1");
	}
	
	private void metodoDaSobrecarga(int i) {
		System.out.println("Sobrecarga " + i);
	}
	
	private void metodoDaSobrecarga(String i) {
		System.out.println("Sobrecarga " + i);
	}
	
	public static void main(String[] args) {
		Sobrecarga sobrecarga = new Sobrecarga();
		
		sobrecarga.metodoDaSobrecarga();
		sobrecarga.metodoDaSobrecarga(2);
		sobrecarga.metodoDaSobrecarga("dois");
		
	}
	

}
