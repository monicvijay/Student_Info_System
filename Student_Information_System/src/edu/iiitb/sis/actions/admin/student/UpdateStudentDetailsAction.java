package edu.iiitb.sis.actions.admin.student;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import edu.iiitb.sis.dao.admin.student.StudentDao;
import edu.iiitb.sis.model.Student;

public class UpdateStudentDetailsAction extends ActionSupport implements ModelDriven<Student>
{
	private static final long serialVersionUID = 1L;
	private StudentDao studentDao=new StudentDao();
	private Student studentObj=new Student();
	private String message;
	

	public String execute()
	{
		studentDao=new StudentDao();
		message=studentDao.updateStudent(studentObj);
		if(message.equalsIgnoreCase("success"))
		{
			return "success";

		}
		else
		{
			return "failure";

		}
	}
	public String getMessage()
	{
		return message;
	}


	public void setMessage(String message) 
	{
		this.message = message;
	}


	public Student getModel() 
	{
		return studentObj;
	}
	
	
	public Student getStudentObj() 
	{
		return studentObj;
	}

	public void setStudentObj(Student studentObj) 
	{
		this.studentObj = studentObj;
	}

	
}
