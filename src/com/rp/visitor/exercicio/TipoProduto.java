package com.rp.visitor.exercicio;

import java.math.BigDecimal;

public enum TipoProduto {
	TIPO_A(new BigDecimal(2)), TIPO_B(new BigDecimal(3)), TIPO_C(
			new BigDecimal(4));

	private final BigDecimal valorBase;

	private TipoProduto(BigDecimal valorBase) {
		this.valorBase = valorBase;
	}

	public BigDecimal getValorBase() {
		return valorBase;
	}

}
