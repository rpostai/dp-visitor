package com.rp.visitor.exercicio;

import java.math.BigDecimal;

public class ICMSParana implements ICMS {

	@Override
	public BigDecimal calcular(Produto p) {
		return p.getTipoProduto().getValorBase().multiply(new BigDecimal("0.17"));
	}

}
