package com.mavan.Food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Rolls  implements Order{
   @Autowired
   @Qualifier("sosages")
	Order ord;
	
	public Order getOrd() {
		return ord;
	}

	public void setOrd(Order ord) {
		this.ord = ord;
	}

	public void eat()
	{
		System.out.println("rool are best on everthing..");
		ord.eat();
	}

}
