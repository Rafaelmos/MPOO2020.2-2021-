package questao8_1;

public class Main {
	
	public static void main(String[] args) {
		Data data = new Data();
		Data data1 = new Data(5);
		Data data2 = new Data(6,2);
		Data data3 = new Data(1,2,2021);
		
		data.imprimirData();
		data1.imprimirData();
		data2.imprimirData();
		data3.imprimirData();
	}
}