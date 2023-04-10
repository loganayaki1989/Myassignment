package org.system;

public class Desktop extends Computer {
	public void desktopSize()
	{
		System.out.println("You can access Desktop but size is 24*10 Screen size");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop lenovo=new Desktop();
		
		lenovo.computerModel();
		lenovo.desktopSize();
	}

}
