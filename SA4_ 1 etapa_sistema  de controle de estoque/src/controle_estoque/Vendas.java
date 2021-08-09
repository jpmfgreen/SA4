package controle_estoque;

import java.util.Date;
import java.util.List;

public class Vendas extends Cliente{
	
	private int quantidade;
	private Double valor;
	private String forma_pg;
	private Date data;
		

	List<Produto> produtos;	
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getForma_pg() {
		return forma_pg;
	}

	public void setForma_pg(String forma_pg) {
		this.forma_pg = forma_pg;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	
	
	
}
