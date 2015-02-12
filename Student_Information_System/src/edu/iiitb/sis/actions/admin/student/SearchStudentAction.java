package edu.iiitb.sis.actions.admin.student;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import edu.iiitb.sis.dao.admin.student.StudentDao;

public class SearchStudentAction extends ActionSupport 
{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<String> listOfRollNumbers;
	private StudentDao studentDao;
	private String searchKey;
	private String message;
	
	
	public String execute()
	{
		studentDao=new StudentDao();
		listOfRollNumbers=new ArrayList<String>();
		listOfRollNumbers=studentDao.getStudentRollNumbers();
			
		return "success";	
	}
	
	
	public String getMessage() 
	{
		return message;
	}
	public void setMessage(String message)
	{
		this.message = message;
	}

	
	public List<String> getListOfRollNumbers() 
	{
		return listOfRollNumbers;
	}
	public void setListOfRollNumbers(List<String> listOfRollNumbers) 
	{
		this.listOfRollNumbers = listOfRollNumbers;
	}
	
	public String getSearchKey()
	{
		return searchKey;
	}

	public void setSearchKey(String searchKey)
	{
		this.searchKey = searchKey;
	}
	

	
}
