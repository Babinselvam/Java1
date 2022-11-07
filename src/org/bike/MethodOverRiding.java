package org.bike;

public class MethodOverRiding extends MethodOverLoading {
	public void bikecost(long cost) {
		super.bikecost(cost);
	}
	public void bikespeed(int speed) {
		super.bikespeed(speed);
		
	}
	public static void main(String[] args) {
		MethodOverLoading s=new MethodOverRiding();
		s.bikecost(215000l);
		s.bikespeed(160);
	}

}
