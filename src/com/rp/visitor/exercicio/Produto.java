package com.rp.visitor.exercicio;

import java.math.BigDecimal;

public interface Produto {
	
	public void reterICMS(ICMS icms);
	
	public TipoProduto getTipoProduto();
	
	BigDecimal getIcmsRetido();
}
