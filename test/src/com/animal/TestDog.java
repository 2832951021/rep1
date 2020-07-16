package com.animal;

public class TestDog {

	public static void main(String[] args) {
		Dog q =new Dog();
		q.setname("ÂÞÑÞ·¼");
		q.setage(18);
		q.setsex("Å®");	
		q.sleeping();
		q.talk();
		Dog p = new Dog("ÂÞÑÞ·¼",18,"Å®");
		p.sleeping();
		p.talk();	

	}

}
