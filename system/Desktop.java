package org.system;

public class Desktop extends Computer{
public void Desktopsize() {
	System.out.println("Desktop Size");
}
public static void main(String[] args) {
	Desktop dc = new Desktop();
	dc.ComputerMode();
	dc.Desktopsize();
}
}
