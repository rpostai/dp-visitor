package com.rp.visitor.exercicio;

public class Sistema {
	
	public static void main(String[] args) {
		ICMS i1 = new ICMSParana();
		ICMS i2 = new ICMSSaoPaulo();
		
		Produto p1 = new ProdutoArroz();
		p1.reterICMS(i1);
		System.out.println(p1.getIcmsRetido());
		p1.reterICMS(i2);
		System.out.println(p1.getIcmsRetido());
		
		Produto p2 = new ProdutoCarne();
		p2.reterICMS(i1);
		System.out.println(p2.getIcmsRetido());
		
		p2.reterICMS(i2);
		System.out.println(p2.getIcmsRetido());
		
		
		
		
	}
}
