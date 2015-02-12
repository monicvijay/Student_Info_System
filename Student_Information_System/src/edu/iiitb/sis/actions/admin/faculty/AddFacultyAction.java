package edu.iiitb.sis.actions.admin.faculty;

import com.opensymphony.xwork2.ModelDriven;

import edu.iiitb.sis.dao.admin.faculty.facultyDao;
import edu.iiitb.sis.model.Faculty;

public class AddFacultyAction implements ModelDriven<Faculty> {

	private Faculty facultyModelObj=new Faculty();
	private String message;
	
	public String execute()
	{
		 facultyDao facultyDaoObj=new facultyDao();
		message=facultyDaoObj.addFaculty(facultyModelObj);
		return message;
		
	}
	
	
	
	
	
	public Faculty getFacultyModelObj() {
		return facultyModelObj;
	}


	public void setFacultyModelObj(Faculty facultyModelObj) {
		this.facultyModelObj = facultyModelObj;
	}


	public Faculty getModel() {
		// TODO Auto-generated method stub
		return facultyModelObj;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}

		
	
}
