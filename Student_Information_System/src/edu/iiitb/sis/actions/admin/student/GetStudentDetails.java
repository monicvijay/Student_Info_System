package edu.iiitb.sis.actions.admin.student;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import edu.iiitb.sis.dao.admin.student.StudentDao;
import edu.iiitb.sis.model.Student;

public class GetStudentDetails extends ActionSupport implements ModelDriven<Student>
{
	
	private static final long serialVersionUID = 1L;
	
	private StudentDao studentDao;
	private String name;
	private String number;
	public String getName() {
		return name;
	}


	public void setName(String name) 
	{
		this.name = name;
	}

	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}

	private String searchKey;
	private Student student=new Student();
	private String message;
	
	public String execute()
	{
		studentDao=new StudentDao();
		System.out.println("search key : "+searchKey);
		student=studentDao.getStudentDetails(searchKey);
		name=student.getStudentName();
		number=student.getStudentRollNo();
		if(student!=null)
		{
			return "success";
		}
		else
		{
			return "failure";	

		}
	}
	
	
	public String getSearchKey()
	{
		return searchKey;
	}
	public void setSearchKey(String searchKey)
	{
		this.searchKey = searchKey;
	}
	public Student getStudent() 
	{
		return student;
	}
	public void setStudent(Student student) 
	{
		this.student = student;
	}
	public String getMessage() 
	{
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public Student getModel() 
	{
		return student;
	}

	
}


