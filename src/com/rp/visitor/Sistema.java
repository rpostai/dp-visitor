package com.rp.visitor;

public class Sistema {
	public static void main(String[] args) {
		Element metro = new Metro(MeioPagamento.AVULSO);
		metro.accept(new Area1());
		System.out.println(metro.getValor());

		metro = new Metro(MeioPagamento.CARTAO);
		metro.accept(new Area2());
		System.out.println(metro.getValor());

		metro = new Metro(MeioPagamento.CARTAO);
		metro.accept(new Area3());
		System.out.println(metro.getValor());

	}
}
