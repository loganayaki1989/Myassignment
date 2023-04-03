package Week2.day1;

public class ReversString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String data="Hope all are happy";
char[] ch=data.toCharArray();
for(int i=ch.length-1;i>=0;i--)
{
	System.out.print(ch[i]);
}
	}

}
