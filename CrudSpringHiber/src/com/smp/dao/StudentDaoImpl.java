package com.smp.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.smp.beans.Student;

public class StudentDaoImpl implements Studentdao {
	private HibernateTemplate hibernateTemplate;
    String Status="";
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	@Transactional
	@Override
	public String SaveStudent(Student stud) 
	{
	 Integer in= (Integer) hibernateTemplate.save(stud);
	 if(in==stud.getId())
	 {
		 Status="Success";
	 }
	 else
	 {
		 Status="Fail";
	 }
		return Status;
	}
    @Transactional
	@Override
	public Student SearchStudent(int id) {
		Student stud=hibernateTemplate.get(Student.class, id);
		return stud;
	}
    @Transactional
	@Override
	public String Updatestudent(Student stud) {
		 hibernateTemplate.saveOrUpdate(stud);
		Status="Success";
		return Status;
	}
    @Transactional
	@Override
	public String DeleteStudent(int id) {
    	Student stud=new Student();
    	stud.setId(id);
		hibernateTemplate.delete(stud);
		Status="Success";
		return Status;
	}
    @Transactional
   	@Override
    public void ShowStudentList()
    {  // List<Student>list=new ArrayList<Student>();
    ArrayList<Student>stud =(ArrayList<Student>) hibernateTemplate.loadAll(Student.class);
    	for(Student s1:stud )
		{
			System.out.println("Student Id ="+s1.getId()+"\t Name ="+s1.getName()+"\t  ClgNmae ="+s1.getClgName()+"");
		}
	}

}
