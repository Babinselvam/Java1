package org.bank2;

public class BabkInfoB extends BankInfo {
	public void deposit() {
		System.out.println(5000);
	}
	public static void main(String[] args) {
		BabkInfoB s=new BabkInfoB();
		s.saving();
		s.fixed();
		s.deposit();
		
	}

}
