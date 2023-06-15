package com.smp.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.smp.beans.Student;
import com.smp.dao.Studentdao;


public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
      Studentdao dao  =(Studentdao)context.getBean("studDao");
      Scanner sc=new Scanner(System.in);
      boolean num=true;
      System.out.println("-----------Welcome Student Portal----------");
      while(num)
        {
    	  System.out.println("Choose one option");
    	  System.out.println("1) Save Student Information");
    	  System.out.println("2) Search Student Information");
    	  System.out.println("3) Update Student Information");
    	  System.out.println("4) Delete Student Information");
    	  System.out.println("5) Show List of Student ");
    	  System.out.println("6) Exit Student App");
    	  int num1=sc.nextInt();
    	  switch(num1)
    	  {
    	  case 1:
    		  Student stud=new Student();
    		  System.out.println("Enter Student Name=");
    		  stud.setName(sc.next());
    		  System.out.println("Enter Student Id=");
    		  stud.setId(sc.nextInt());
    		  System.out.println("Enter Clg Name=");
    		  stud.setClgName(sc.next());
    		  String status=dao.SaveStudent(stud);
    		  break;
    	  case 2:
    		  System.out.println("Search Student by Id=");
    		  Student stud1=dao.SearchStudent(sc.nextInt());
    		  if(stud1 !=null) {
    		  System.out.println(stud1);
    		  } else 
    		  {
    			  System.out.println("Records not found");
    		  }
    		  break;
    	  case 3:
    		  Student stud2=new Student();
    		  System.out.println("Update  Student information by old Id=");
    		  stud2.setId(sc.nextInt());
    		  System.out.println("Update Student Name =");
    		  stud2.setName(sc.next());
    		  System.out.println("Update Clg Name =");
    		  stud2.setClgName(sc.next());
    		 String status1 =dao.Updatestudent(stud2);
    		 System.out.println("Update Impormation"+status1);
    		  break;
    	  case 4:	
    		  System.out.println("delete  Student information by Id=");
    		  int StudId=sc.nextInt();
    		  String status4=dao.DeleteStudent(StudId);
    		  System.out.println("Delete Impormation"+status4);
    		  break;
    	  case 5:	dao.ShowStudentList();
    	           break;
    	  case 6:
    		 num=false;
    		  break;
    	  }
    	 
    			continue;
    		  
        }
      System.out.println("Exit from Application");
	}

}
