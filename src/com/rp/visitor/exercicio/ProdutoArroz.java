package com.rp.visitor.exercicio;

import java.math.BigDecimal;

public class ProdutoArroz implements Produto {

	private BigDecimal icmsRetido;

	@Override
	public void reterICMS(ICMS icms) {
		icmsRetido = icms.calcular(this);
	}

	@Override
	public TipoProduto getTipoProduto() {
		return TipoProduto.TIPO_A;
	}

	public BigDecimal getIcmsRetido() {
		return icmsRetido;
	}

	public void setIcmsRetido(BigDecimal icmsRetido) {
		this.icmsRetido = icmsRetido;
	}

}
