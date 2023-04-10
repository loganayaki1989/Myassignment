package org.student;

import org.college.College;
import org.department.DepartMent;
public class Student extends DepartMent{
	

public void studentName()
	{
		System.out.println("Student name is R.sai sharvesh");
	}
	public void studentDepart()
	{
		System.out.println("Department is CSE");
	}
	public void studentid()
	{
		System.out.println("Id is 666666");
	}
	
	
	public static void main(String[] args) {
		
		Student stud=new Student();
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();
		stud.deptName();
		stud.studentName();
		stud.studentDepart();
		stud.studentid();
		
		
		
		// TODO Auto-generated method stub

	}

}
