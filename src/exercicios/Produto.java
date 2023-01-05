package exercicios;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.25;
	boolean diaEspecial = false;
	
	Produto(){}
	Produto(String nomeInicial, double precoInicial, double descontoInicial){
		desconto = descontoInicial;
		nome = nomeInicial;
		preco = precoInicial;
		
	}	
	
	Produto(String nomeInicial){
		nome = nomeInicial;
		
	}
	
	Produto(double descontoTotal){
		desconto = descontoTotal;
		if (diaEspecial == true){
			descontoTotal = 0.35;
		}
		
	}
	
	
	double precoComDesconto(){
		if (diaEspecial == true){
			desconto = 0.35;
		}
		return preco * (1 - desconto);
		
	}
	
	double precoComDesconto(double descontoDoGerente) {
		return preco *(1 - desconto + descontoDoGerente);
	}
}
