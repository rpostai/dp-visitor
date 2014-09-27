package com.rp.visitor;

import java.math.BigDecimal;

public class Area3 implements Visitor {

	@Override
	public BigDecimal visit(Metro element) {
		return new BigDecimal("15").multiply(element.getMeioPagamento()
				.getConstanteMultiplicação());
	}

}
