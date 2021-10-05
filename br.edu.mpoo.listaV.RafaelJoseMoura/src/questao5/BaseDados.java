package questao5;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class BaseDados {
	private static ArrayList<Compra> compras = new ArrayList<Compra>();
	private static ArrayList<Venda> vendas = new ArrayList<Venda>();

	public static Compra buscarCompra(Compra compra) {
		for (Compra c : compras) {
			if (compras.contains(compra)) {
				return c;
			}
		}
		return null;
	}

	public static Compra buscarCompra(int id) {
		for (Compra c : compras) {
			if (c.getId() == id) {
				return c;
			}
		}
		return null;
	}

	public static boolean adicionarCompra(Compra compra) {
		if (buscarCompra(compra) != null) {
			atualizarVendas(compra);
			compras.add(compra);
			atualizarVendas(compra);
		}
		return false;
	}

	public static boolean removerCompra(Compra compra) {
		if (buscarCompra(compra) != null) {
			compras.remove(compras.indexOf(buscarCompra(compra)));
			atualizarVendas(compra);
			return true;
		}
		return false;
	}

	public static double totalVendas(int mes, int ano) {
		int i = 0;
		for (Venda venda : vendas) {
			if (venda.getAno() == ano && venda.getMes() == mes) {
				i++;
			}
			return i;
		}
		return i;
	}

	public static boolean atualizarVendas(Compra compra) {
		Venda venda = new Venda(0, 0, 0);
		GregorianCalendar dataCal = new GregorianCalendar();
		dataCal.setTime(compra.getDate());
		int mes = dataCal(Calendar.MONTH);
		int ano = dataCal(Calendar.YEAR);
		venda.setMes(mes);
		venda.setAno(ano);
		venda.setValorTotal(compra.getValorTotal());
		if (buscarCompra(compra) != null) {
			return vendas.add(venda);
		} else {
			for (Venda v : vendas) {
				if (v.equals(venda)) {
					return vendas.remove(v);
				}
			}
		}
		return false;
	}

	private static int dataCal(int month) {
		return 0;
	}

	public static ArrayList<Compra> getCompras() {
		return compras;
	}

	public static ArrayList<Venda> getVendas() {
		return vendas;
	}
	
		
	}
	

