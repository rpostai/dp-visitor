package com.rp.visitor;

import java.math.BigDecimal;

public class Area1 implements Visitor {

	@Override
	public BigDecimal visit(Metro metro) {
		return BigDecimal.ONE.multiply(metro.getMeioPagamento()
				.getConstanteMultiplicação());
	}

}
