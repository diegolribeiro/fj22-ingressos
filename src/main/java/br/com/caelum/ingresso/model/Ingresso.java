package br.com.caelum.ingresso.model;

import java.math.BigDecimal;

import br.com.caelum.ingresso.model.descontos.Desconto;

public class Ingresso {

	private Sessao sessao;
	private BigDecimal preco;
	private Lugar lugar;

	public Ingresso() {
		super();
	}

	/**
	 * @param sessao
	 * @param preco
	 */
	public Ingresso(Sessao sessao, Desconto tipoDeDesconto, Lugar lugar) {
		super();
		this.setSessao(sessao);
		this.setPreco(tipoDeDesconto.aplicarDescontoSobre(sessao.getPreco()));
		this.lugar = lugar;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Sessao getSessao() {
		return sessao;
	}

	public void setSessao(Sessao sessao) {
		this.sessao = sessao;
	}

}
