package questao5;

public class Mensagem {
	
	public String exibirMensagem(GerenteVendas gerenteVendas) {
		String mensagem;
		if (gerenteVendas.darDesconto(null)>0) {
			mensagem ="Desconto dado com sucesso";
		} else {
			mensagem = "Desconto não autorizado";
		}
		return mensagem;
	}
	

}
