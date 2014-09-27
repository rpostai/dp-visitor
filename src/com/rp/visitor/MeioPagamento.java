package com.rp.visitor;

import java.math.BigDecimal;

public enum MeioPagamento {
	AVULSO(new BigDecimal("1.5")), CARTAO(new BigDecimal("1.2"));

	private BigDecimal constanteMultiplica��o;

	private MeioPagamento(BigDecimal constanteMultiplicacao) {
		this.constanteMultiplica��o = constanteMultiplicacao;
	}

	public BigDecimal getConstanteMultiplica��o() {
		return constanteMultiplica��o;
	}


}
