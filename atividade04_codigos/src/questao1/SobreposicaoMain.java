package questao1;

public class SobreposicaoMain extends Sobreposicao{

	public SobreposicaoMain() {
	}

	@Override
	public void metodoDaSobrePosicao() {
		System.out.println("Classe Filho 2");
	}


	public static void main(String[] args) {
		
		SobreposicaoFilho filho = new SobreposicaoFilho();	
		filho.metodoDaSobrePosicao();
		
		SobreposicaoMain filho2 = new SobreposicaoMain();
		filho2.metodoDaSobrePosicao();
	}

}
