package org.sample;

public class Desktop implements HardWare,SoftWare{
public void hardwareResources()
{
	System.out.println("Hardwares: Moniter, Keyboard,Mouse,etc...");
}
@Override
	public void softwareResources() {
		// TODO Auto-generated method stub
		System.out.println("Softwares: OS, Applications, etc....");
	}
private void desktopModel() {
	// TODO Auto-generated method stub
System.out.println("Desktop Model:********");
}
public static void main(String[] args) {
	Desktop d=new Desktop();
	d.desktopModel();
	d.hardwareResources();
	d.softwareResources();
}
}
