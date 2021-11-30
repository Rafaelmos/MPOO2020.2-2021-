package model;

import java.util.Random;

public class Campanha extends Thread implements BlackMinuto {
	private static boolean isCampanha;

	public Campanha() {

	}

	public void dispararCampanha() {
		Random random = new Random();
		if (isCampanha) {
			try {
				Campanha.sleep(10000);
				definirCampanhar(BaseDados.getProdutos().get(random.nextInt(BaseDados.getProdutos().size())));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void definirCampanhar(Produto produto) {
		produto.setPreco(produto.getPreco() * BlackMinuto.cupomDesconto);
	}

}
