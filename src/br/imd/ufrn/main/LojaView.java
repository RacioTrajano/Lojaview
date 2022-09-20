package br.imd.ufrn.main;

import br.imd.ufrn.dominio.Deposito;
import br.imd.ufrn.dominio.ProdutoDuravel;
import br.imd.ufrn.dominio.ProdutoNaoDuravel;

public class LojaView {

	public static void main(String[] args) {
		ProdutoDuravel carro = new ProdutoDuravel("carro", 50000.00);
		ProdutoDuravel livro = new ProdutoDuravel("livro", 20.00);
		ProdutoDuravel celular = new ProdutoDuravel("celular", 500.00);
		
		ProdutoNaoDuravel chocolate = new ProdutoNaoDuravel("chocolate", 1.00);
		ProdutoNaoDuravel toalha = new ProdutoNaoDuravel("toalha", 20.00);
		ProdutoNaoDuravel sabonete = new ProdutoNaoDuravel("sabonete", 3.50);
		
		
		Deposito deposit = new Deposito();
		deposit.addProduto(carro);
		deposit.addProduto(livro);
		deposit.addProduto(celular);
		
		System.out.println(deposit.listarProdutos());
		deposit.rmProduto(livro);
		System.out.println(deposit.listarProdutos());
		
		System.out.println(deposit.maiorPreco());

	}

}
