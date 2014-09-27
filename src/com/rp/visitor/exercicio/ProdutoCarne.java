package com.rp.visitor.exercicio;

import java.math.BigDecimal;

public class ProdutoCarne implements Produto {

	private BigDecimal icmsRetido;
	
	@Override
	public void reterICMS(ICMS icms) {
		icmsRetido = icms.calcular(this);
	}

	@Override
	public TipoProduto getTipoProduto() {
		return TipoProduto.TIPO_C;
	}

	@Override
	public BigDecimal getIcmsRetido() {
		return icmsRetido;
	}

}
