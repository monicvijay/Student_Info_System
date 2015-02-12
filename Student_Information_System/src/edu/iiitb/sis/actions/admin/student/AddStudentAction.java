package edu.iiitb.sis.actions.admin.student;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import edu.iiitb.sis.actions.authentication.SendEmail;
import edu.iiitb.sis.dao.admin.student.StudentDao;
import edu.iiitb.sis.model.Student;
import edu.iiitb.sis.model.UserDetails;

public class AddStudentAction extends ActionSupport implements ServletRequestAware,ModelDriven<Student>
{
	
	private static final long serialVersionUID = 1L;
	private HttpServletRequest servletRequest;
	private Student studentObj=new Student();
	private StudentDao studentDao;
	private String message;
	private UserDetails user=new UserDetails();
	private SendEmail sendEmail=new SendEmail();
	public String execute()
	{
		studentDao=new StudentDao();
		System.out.println(studentObj.getDateOfBirth());
		String destpath = servletRequest.getSession().getServletContext().getRealPath("/");
		studentObj.setImagePath(destpath);
		System.out.println("Image Path :"+destpath);
		System.out.println("Inserting Data into Student Table");
		message=studentDao.addStudent(studentObj);
		System.out.println("Data Added to Student Table "+message);
		
		if(message.equalsIgnoreCase("success"))
		{
			user.setName(studentObj.getStudentName());
			user.setEmail(studentObj.getEmail());
			user.setPassword("password");
			user.setLoginId(studentObj.getStudentRollNo());
			message=sendEmail.sendUserDetailsToMail(user);
			return "success";
		}
		else
		{
			return "failure";
		}
		
	}
		
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
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

	public HttpServletRequest getServletRequest() {
		return servletRequest;
	}

	public void setServletRequest(HttpServletRequest servletRequest) {
		this.servletRequest = servletRequest;
	}
	

}
