package br.imd.ufrn.dominio;

public class ProdutoDuravel extends Produto {
	private int durabilidade;

	public ProdutoDuravel() {
		
	}
	
	public ProdutoDuravel(String nome, double preco) {
		setNome(nome);
		setPreco(preco);
	}

	public int getDurabilidade() {
		return durabilidade;
	}

	public void setDurabilidade(int durabilidade) {
		this.durabilidade = durabilidade;
	}
}
