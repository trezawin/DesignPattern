package com.treza.touch.design.patterns.Adapter;

public class TurkeyAdapterClient {
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		duck.quack();
		duck.fly();
		
		WildTurkey turkey = new WildTurkey();
		turkey.gobble();
		turkey.fly();
		
		
		TurkeyAdapter adapter = new TurkeyAdapter(turkey);
		adapter.quack();// turkey can quack and fly muliple times of short distance.
		adapter.fly();
		
	}
}
