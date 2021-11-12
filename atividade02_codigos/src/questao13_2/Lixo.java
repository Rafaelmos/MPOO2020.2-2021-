package questao13_2;

public class Lixo {
	public int id;
	public String nome;
	public String tipo;

	public Lixo(int id, String nome, String tipo) {
		super();
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
	}

	public void detroyed(Lixo[] lixos) {
		lixos = null;
		System.gc();
	}

}
