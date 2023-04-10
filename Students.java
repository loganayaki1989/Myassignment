package week3.day1;

public class Students {
	public void getStudentinfo(int id)
	{
		System.out.println("Student is: "+ id);	
	}
	
	public void getStudentinfo(int id,String name)
	{
	
		System.out.println("Student is: " +id);
		System.out.println("Student Name is: " +name);
	}
	public void getStudentinfo(int id,int Rollno,String Email,long phoneno)
	{
       
		System.out.println("Student is id: " +id);
		System.out.println("Roll no is: " +Rollno);
		System.out.println("Student Email is: " +Email);
		System.out.println("Phone Number is: "  +phoneno);
		
		
	}
	public static void main(String[] args) {
		
		Students stud=new Students();

		stud.getStudentinfo(55555);
		
		stud.getStudentinfo(666,"Sai");
		stud.getStudentinfo(123,5555,"loganayaki.msc@gmail.com",4567836587l);
		// TODO Auto-generated method stub

	}

}

