package com.rp.visitor;

import java.math.BigDecimal;

public class Area2 implements Visitor {

	@Override
	public BigDecimal visit(Metro element) {
		return BigDecimal.TEN.multiply(element.getMeioPagamento()
				.getConstanteMultiplicação());
	}

}
