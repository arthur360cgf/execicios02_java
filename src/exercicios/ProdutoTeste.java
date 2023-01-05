package exercicios;


public class ProdutoTeste {
	public static void main(String[] args) {
		
		//Produto p1 = new Produto("notebook", 4356.89, 0.25);
		//p1.nome = "notebook";
		//p1.preco = 4356.89;
		//p1.desconto = 0.25;
		
		var p2 = new Produto("Caneta Azul");
		p2.nome = "Caneta Azul";
		p2.preco = 3000;
		
		
		Produto dataEspecial = new Produto();
		dataEspecial.nome = "Televisão";
		dataEspecial.preco = 3000;
		dataEspecial.diaEspecial = true;
		
		System.out.println(p2.nome);
		//System.out.println(p1.nome);
		
		double precoDiaEspecial = dataEspecial.precoComDesconto();
		//double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		//double mediaCarrinho = (precoFinal1 + precoFinal2) /2;
		//System.out.println(mediaCarrinho);
		System.out.println(precoFinal2);
		
		System.out.println(dataEspecial.nome);
		System.out.println(precoDiaEspecial);
		
		System.out.println();
		
		
	}
		
}
