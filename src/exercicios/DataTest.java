package exercicios;

public class DataTest {
	public static void main(String[] args) {
		Data d = new Data();
		
		d.dia = 14;
		d.mes = 07;
		d.ano = 2000;
		
		var da = new Data();
		da.dia = 19;
		da.mes = 06;
		da.ano = 1979;
		
		System.out.println(d.dia + "/" + d.mes + "/" + d.ano);
		System.out.println(da.dia + "/" + da.mes + "/" + da.ano);
		
	}

}
