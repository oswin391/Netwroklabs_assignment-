package com.mavan.Food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bugers implements Order{
	@Autowired
	sosages sos;
	@Autowired
	soosssa sos1;
	@Autowired
	Rolls ro;
	@Override
	public String toString() {
		return "Bugers [sos=" + sos + ", sos1=" + sos1 + "]";
	}

	public sosages getSos() {
		return sos;
	}

	public void setSos(sosages sos) {
		this.sos = sos;
	}

	public soosssa getSos1() {
		return sos1;
	}

	public void setSos1(soosssa sos1) {
		this.sos1 = sos1;
	}

	public void eat()
	{
		System.out.println("zinger burgers are grrat...");
		sos.eat();
		sos1.eat();
		ro.eat();
	}

}
