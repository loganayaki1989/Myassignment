package week3.day1;

public class AndroidPhone extends Mobile{
	
	public void takeVideo()
	{
		System.out.println("My new Video is aharing to all");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AndroidPhone samsung=new AndroidPhone();
	    samsung.makeCall();	
		samsung.sendMsg();
		samsung.takeVideo();
	}

}
