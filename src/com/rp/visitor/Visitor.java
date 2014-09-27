package com.rp.visitor;

import java.math.BigDecimal;

public interface Visitor {
	
	public BigDecimal visit(Metro element);
}
