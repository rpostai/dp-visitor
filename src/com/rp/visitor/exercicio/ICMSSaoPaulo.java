package com.rp.visitor.exercicio;

import java.math.BigDecimal;

public class ICMSSaoPaulo implements ICMS {

	@Override
	public BigDecimal calcular(Produto p) {
		return p.getTipoProduto().getValorBase().multiply(new BigDecimal("0.18"));
	}

}
