package org.resources;

public class Desktop1 implements Desktop {
	public void hardwareresources() {
		System.out.println("monitor");
	}
	public void softwarewareresources() {
		System.out.println("windows10");
		
	}
	public void desktopmodel() {
		System.out.println("Lenovo");
	}
	public static void main(String[] args) {
		Desktop1 s=new Desktop1();
		s.hardwareresources();
		s.softwarewareresources();
		s.desktopmodel();
	}

}
