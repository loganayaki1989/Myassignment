package Week2.day1;

public class ReverseElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="Iamasoftwaretester";
		char[] ch=data.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
}
String[] split=data.split("software");
			for(int i=0;i<=split.length;i++)
			{
				System.out.println(split[i]);
			}
	}
}

