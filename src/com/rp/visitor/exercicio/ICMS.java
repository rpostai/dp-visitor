package com.rp.visitor.exercicio;

import java.math.BigDecimal;

// representa o visitor
public interface ICMS {
	public BigDecimal calcular(Produto p); 
}
