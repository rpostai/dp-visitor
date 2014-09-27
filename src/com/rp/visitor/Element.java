package com.rp.visitor;

import java.math.BigDecimal;

public interface Element {
	
	public void accept(Visitor visitor);
	
	public BigDecimal getValor();
}
