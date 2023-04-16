package week3.day1;

public class SmartPhone extends AndroidPhone {
	
	public void ConnectWhatsup()
	{
		System.out.println("whats call connected to groups");
	}

	public void takeVideo()
	{
		System.out.println("Connected to all and shared");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SmartPhone moto=new SmartPhone();
		moto.ConnectWhatsup();
		moto.makeCall();	
		moto.sendMsg();
		moto.takeVideo();
	}

}
