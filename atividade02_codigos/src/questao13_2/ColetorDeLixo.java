package questao13_2;


public class ColetorDeLixo {

	public static void main(String[] args) {
		Lixo[] lixos = new Lixo[1000];
		Lixo lixo = null;

		for (int i = 0; i < lixos.length; i++) {
			lixo = new Lixo(i, "lixo" + i, "papel" + i);
			lixos[i] = lixo;
			//System.out.println(lixos[i]);
		}

		
		System.out.println("Lixos gerados");
		lixo.detroyed(lixos);
		System.out.println("Lixo Coletado");
	}

}
