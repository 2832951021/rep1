package com.animal;

public class TestDog {

	public static void main(String[] args) {
		Dog q =new Dog();
		q.setname("���޷�");
		q.setage(18);
		q.setsex("Ů");	
		q.sleeping();
		q.talk();
		Dog p = new Dog("���޷�",18,"Ů");
		p.sleeping();
		p.talk();	

	}

}
