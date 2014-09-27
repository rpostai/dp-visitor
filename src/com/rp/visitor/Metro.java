package com.rp.visitor;

import java.math.BigDecimal;

public class Metro implements Element {

	private final MeioPagamento meioPagamento;

	private BigDecimal valor;

	public Metro(MeioPagamento meioPagamento) {
		this.meioPagamento = meioPagamento;
	}

	@Override
	public void accept(Visitor visitor) {
		valor = visitor.visit(this);
	}

	public MeioPagamento getMeioPagamento() {
		return meioPagamento;
	}

	public BigDecimal getValor() {
		return valor;
	}

}
