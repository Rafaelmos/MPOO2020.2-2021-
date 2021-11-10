package questao3;

import questao3.telas.TelaBuscarCliente;
import questao3.telas.TelaBuscarProduto;
import questao3.telas.TelaMenu;
import questao3.telas.TelaModelo2;

public class Controller {
	private TelaMenu telaMenu;
	private TelaBuscarCliente telaBuscarCliente;
	private TelaBuscarProduto telaBuscarProduto;

	public Controller() {
		super();
		this.telaMenu = new TelaMenu(this);
		this.telaBuscarCliente = new TelaBuscarCliente(this);
		this.telaBuscarProduto = new TelaBuscarProduto();
	}
	
	

}
