package br.imd.ufrn.dominio;

import java.util.ArrayList;

public class Deposito {
	private ArrayList<Produto> armazem;
	
	public Deposito() {
		armazem = new ArrayList<Produto>();
	}
	
	public void addProduto(Produto product) {
		armazem.add(product);
	}
	public void rmProduto(Produto product){
		for(Produto d : listarProdutos()) {
			if(d == product) {
				armazem.remove(d);
			}
		}
	}
	public int qtdProduto(ArrayList<Produto> armazem) {
		
		return armazem.size();
	}
	
	public boolean ehvazio(ArrayList<Produto> armazem) {	
		
		return armazem.isEmpty();	
		
	}
	
	public Produto maiorPreco() {
		Produto product = new Produto();
		double maior = 0;
		for (Produto d : listarProdutos()) {
			if(d.getPreco() > maior) {
			maior = d.getPreco();
			product = d;
			}
		}
		return product;
	}
	
	public ArrayList<Produto> listarProdutos() {
		ArrayList<Produto> produtosRetornados = new ArrayList<Produto>();
		produtosRetornados.addAll(armazem);
		return produtosRetornados;
	}
	
}
