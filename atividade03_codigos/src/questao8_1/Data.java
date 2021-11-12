package questao8_1;

public class Data {
	private  int dia;
	private  int mes;
	private  int ano;
	
	public Data() {
	}
	
	public Data(int dia) {
		  this.dia = dia;
	}
	
	public Data(int dia, int mes) {
		  this.dia = dia;
		  this.mes = mes;
	}
	
	public Data(int dia, int mes, int ano) {
		  this.dia = dia;
		  this.mes = mes;
		  this.ano = ano;
	}
	
	public void imprimirData() {
		System.out.println("\n");
		System.out.println("Dia: "+this.dia+" Mes: "+this.mes+" Ano: "+this.ano);
		System.out.println("Data (dia/mes/ano): "+this.dia+"/"+this.mes+"/"+this.ano);
		System.out.println("Data (mes/ano): "+this.mes+"/"+this.ano);
		System.out.println("Data (dia/mes): "+this.dia+"/"+this.mes);
		System.out.println("\n");
	}
	
}
