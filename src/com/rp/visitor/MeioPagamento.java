package com.rp.visitor;

import java.math.BigDecimal;

public enum MeioPagamento {
	AVULSO(new BigDecimal("1.5")), CARTAO(new BigDecimal("1.2"));

	private BigDecimal constanteMultiplicação;

	private MeioPagamento(BigDecimal constanteMultiplicacao) {
		this.constanteMultiplicação = constanteMultiplicacao;
	}

	public BigDecimal getConstanteMultiplicação() {
		return constanteMultiplicação;
	}


}
