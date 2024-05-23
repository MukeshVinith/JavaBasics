package com.chapter9.p2;

public class TestingInterface3 {

	public static void main(String[] args) {
		Question q = new Question();
		Askme.answer(q.ask());
		Askme.answer(q.ask());
		Askme.answer(q.ask());
		Askme.answer(q.ask());

	}

}
