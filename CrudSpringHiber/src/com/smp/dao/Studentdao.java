package com.smp.dao;

import com.smp.beans.Student;

public interface Studentdao 
	{
	public String SaveStudent(Student stud);
	public Student SearchStudent(int id);
	public String Updatestudent(Student stud);
	public String DeleteStudent(int id);
	public void ShowStudentList();
	
    	

}
